package com.curso.teste_database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.teste_database.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

}
