package com.evertonogura.trabalhandocomdados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evertonogura.trabalhandocomdados.model.RequestModel;
import com.evertonogura.trabalhandocomdados.model.ResponseModel;
import com.evertonogura.trabalhandocomdados.service.DataService;

@RestController
@RequestMapping("/api/")
public class ApiController {

	@Autowired
	private DataService dataService;
	
	@PostMapping("/comidas")
	public ResponseEntity<ResponseModel> adicionar(@RequestBody RequestModel novaComida) {
		return ResponseEntity.status(HttpStatus.CREATED).body(dataService.incluir(novaComida));
	}
	
	@GetMapping("/comidas")
	public ResponseEntity<List<ResponseModel>> consultar() {
		return ResponseEntity.status(HttpStatus.OK).body(dataService.listar());
	}
	
	@GetMapping("/comidas/{id}")
	public ResponseEntity<ResponseModel> consultar(@PathVariable Long id) {
		return ResponseEntity.status(HttpStatus.OK).body(dataService.listar(id));
	}
}