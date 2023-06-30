package com.evertonogura.trabalhandocomdados.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evertonogura.trabalhandocomdados.entity.TipoComida;

@Repository
public interface TipoComidaRepository extends JpaRepository<TipoComida, Long> {
	
	Optional<TipoComida> findByDescricao(String descricao);
	
}
