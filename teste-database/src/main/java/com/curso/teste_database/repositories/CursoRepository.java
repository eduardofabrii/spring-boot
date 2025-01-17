package com.curso.teste_database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste_database.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
