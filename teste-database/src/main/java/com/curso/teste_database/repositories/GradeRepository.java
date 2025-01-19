package com.curso.teste_database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste_database.entities.Grade;

public interface GradeRepository extends JpaRepository<Grade, Integer> {

}
