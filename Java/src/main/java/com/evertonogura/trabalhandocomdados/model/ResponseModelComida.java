package com.evertonogura.trabalhandocomdados.model;

import java.io.Serializable;
import java.util.Objects;

public class ResponseModelComida implements Serializable {

	private static final long serialVersionUID = 7436777072360246982L;
	
	private long identificador;
	
	private String descricao;
	
	private int quantidade;
	
	private String tipoComida;

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
		return "ResponseModel [identificador=" + identificador + ", descricao=" + descricao + ", quantidade="
				+ quantidade + ", tipoComida=" + tipoComida + "]";
	}

	public ResponseModelComida(long identificador, String descricao, int quantidade, String tipoComida) {
		super();
		this.identificador = identificador;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.tipoComida = tipoComida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, identificador, quantidade, tipoComida);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseModelComida other = (ResponseModelComida) obj;
		return Objects.equals(descricao, other.descricao) && identificador == other.identificador
				&& quantidade == other.quantidade && Objects.equals(tipoComida, other.tipoComida);
	}

}
