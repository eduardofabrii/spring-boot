package com.curso.teste_database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste_database.entities.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {

}
