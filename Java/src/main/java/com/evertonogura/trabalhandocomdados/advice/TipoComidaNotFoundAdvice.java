package com.evertonogura.trabalhandocomdados.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.evertonogura.trabalhandocomdados.exception.TipoComidaNotFoundException;
import com.evertonogura.trabalhandocomdados.model.ErroModel;

@ControllerAdvice
public class TipoComidaNotFoundAdvice {
	
	@ExceptionHandler(TipoComidaNotFoundException.class)
	public ResponseEntity<ErroModel> tipoComidaNotFoundHandler(TipoComidaNotFoundException exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErroModel(exception.getMessage()));
	}
	
}
