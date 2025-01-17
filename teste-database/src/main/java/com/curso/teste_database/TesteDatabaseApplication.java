package com.curso.teste_database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.teste_database.entities.Curso;
import com.curso.teste_database.repositories.CursoRepository;

@SpringBootApplication
public class TesteDatabaseApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TesteDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Curso curso1 = new Curso("Arquitetura e Urbanismo");
		Curso curso2 = new Curso("Economia");

		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
	}
}
