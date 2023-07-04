package com.evertonogura.trabalhandocomdados.model;

import java.io.Serializable;
import java.util.Objects;

public class ResponseModelTipoComida implements Serializable {

	private static final long serialVersionUID = -171765929943439228L;
	
	private long identificador;
	
	private String descricao;

	public long getIdentificador() {
		return identificador;
	}

	public void setIdentificador(long identificador) {
		this.identificador = identificador;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public ResponseModelTipoComida(long identificador, String descricao) {
		super();
		this.identificador = identificador;
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ResponseModelTipoComida [identificador=" + identificador + ", descricao=" + descricao + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseModelTipoComida other = (ResponseModelTipoComida) obj;
		return Objects.equals(descricao, other.descricao) && identificador == other.identificador;
	}
	
}
