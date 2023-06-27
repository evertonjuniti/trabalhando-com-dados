package com.evertonogura.trabalhandocomdados.model;

import java.io.Serializable;
import java.util.Objects;

public class RequestModel implements Serializable {

	private static final long serialVersionUID = -7713860407818617728L;
	
	private String descricao;
	
	private int quantidade;
	
	private String tipoComida;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	@Override
	public String toString() {
		return "RequestModel [descricao=" + descricao + ", quantidade=" + quantidade + ", tipoComida=" + tipoComida + "]";
	}

	public RequestModel(String descricao, int quantidade, String tipoComida) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.tipoComida = tipoComida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(quantidade, descricao, tipoComida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestModel other = (RequestModel) obj;
		return quantidade == other.quantidade && Objects.equals(descricao, other.descricao)
				&& Objects.equals(tipoComida, other.tipoComida);
	}
	
}
