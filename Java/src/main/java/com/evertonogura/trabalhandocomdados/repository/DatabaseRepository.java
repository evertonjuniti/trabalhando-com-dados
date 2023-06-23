package com.evertonogura.trabalhandocomdados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evertonogura.trabalhandocomdados.entity.FoodEntity;

public interface DatabaseRepository extends JpaRepository<FoodEntity, Long> {

}
