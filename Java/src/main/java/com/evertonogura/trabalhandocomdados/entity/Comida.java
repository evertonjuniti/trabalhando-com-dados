package com.evertonogura.trabalhandocomdados.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comida")
public class Comida implements Serializable {
	
	private static final long serialVersionUID = -7649056551073926357L;

	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "Descricao")
	private String descricao;
	
	@Column(name = "Quantidade")
	private int quantidade;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Id_Tipo_Comida", nullable = false)
	private TipoComida tipoComida;
	
	public Comida() {}
	
	public Comida(String descricao, int quantidade, TipoComida tipoComida) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.tipoComida = tipoComida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public TipoComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	@Override
	public String toString() {
		return "Comida [id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", idTipoComida="
				+ tipoComida + "]";
	}
	
}
