package com.evertonogura.trabalhandocomdados.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Comida implements Serializable {
	
	private static final long serialVersionUID = -7649056551073926357L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String descricao;
	
	private int quantidade;
	
	public Comida() {}
	
	public Comida(String descricao, int quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
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

	@Override
	public String toString() {
		return "ComidaEntity [id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}	
	
}
