package com.evertonogura.trabalhandocomdados.model;

import java.io.Serializable;

public class JmsModel implements Serializable {
	
	private static final long serialVersionUID = 3238290800570038447L;
	
	private String comida;
	
	private String tipo;
	
	public JmsModel() {}
	
	public JmsModel(String comida, String tipo) {
		super();
		this.comida = comida;
		this.tipo = tipo;
	}

	public String getComida() {
		return comida;
	}

	public void setComida(String comida) {
		this.comida = comida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "JmsModel [comida=" + comida + ", tipo=" + tipo + "]";
	}
	
}
