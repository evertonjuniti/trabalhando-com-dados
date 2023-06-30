package com.evertonogura.trabalhandocomdados.exception;

public class TipoComidaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1839356860216705313L;
	
	public TipoComidaNotFoundException(String descricao) {
		super("Tipo de comida inválido: " + descricao);
	}
	
}
