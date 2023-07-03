package com.evertonogura.trabalhandocomdados.exception;

public class QuantidadeInvalidException extends RuntimeException {
	
	private static final long serialVersionUID = 2693518237700982288L;
	
	public QuantidadeInvalidException (int quantidade) {
		super("Quantidade inválida: " + String.valueOf(quantidade));
	}
	
}
