package com.curso.teste_database.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.teste_database.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {
    public List<Curso> findCursoByName(String nome);
    public List<Curso> findCursoByNameContaining(String valor);
    public List<Curso> findCursoByNameLike(String valor);
    public List<Curso> findCursoByNameLikeIgnoreCase(String valor);

    @Query(value = "Select c From Curso c")
    public List<Curso> findByQueryName();

    @Query(value = "select nome_curso from curso_faculdade where area like '%Computação%'", nativeQuery = true)
    public List<String> findByQueryNamePorArea();
}
