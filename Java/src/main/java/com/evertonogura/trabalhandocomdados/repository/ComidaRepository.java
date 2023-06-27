package com.evertonogura.trabalhandocomdados.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evertonogura.trabalhandocomdados.entity.Comida;

@Repository
public interface ComidaRepository extends JpaRepository<Comida, Long> {
	
	Optional<Comida> findById(Long id);
	
}
