package com.curso.teste_database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.teste_database.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    public List<Curso> findCursoByName(String nome);
    public List<Curso> findCursoByNameContaining(String valor);
    public List<Curso> findCursoByNameLike(String valor);
}
