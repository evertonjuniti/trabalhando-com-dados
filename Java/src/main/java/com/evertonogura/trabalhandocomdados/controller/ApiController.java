package com.evertonogura.trabalhandocomdados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evertonogura.trabalhandocomdados.exception.QuantidadeInvalidException;
import com.evertonogura.trabalhandocomdados.model.RequestModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelComida;
import com.evertonogura.trabalhandocomdados.model.ResponseModelTipoComida;
import com.evertonogura.trabalhandocomdados.service.DataService;

@RestController
@RequestMapping("/api/")
public class ApiController {

	@Autowired
	private DataService dataService;
	
	@GetMapping("/tiposComida")
	public ResponseEntity<List<ResponseModelTipoComida>> consultarTiposComida() {
		return ResponseEntity.status(HttpStatus.OK).body(dataService.listarTiposComida());
	}
	
	@PostMapping("/comidas")
	public ResponseEntity<ResponseModelComida> adicionarComida(@RequestBody RequestModelComida novaComida) {
		validateRequest(novaComida);
		return ResponseEntity.status(HttpStatus.CREATED).body(dataService.incluirComida(novaComida));
	}
	
	@GetMapping("/comidas")
	public ResponseEntity<List<ResponseModelComida>> consultarComidas() {
		return ResponseEntity.status(HttpStatus.OK).body(dataService.listarComidas());
	}
	
	@GetMapping("/comidas/{id}")
	public ResponseEntity<ResponseModelComida> consultarComida(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(dataService.consultarComida(id));
	}
	
	private void validateRequest(RequestModelComida comida) {
		if (comida.getQuantidade() <= 0)
			throw new QuantidadeInvalidException(comida.getQuantidade());
	}
	
}