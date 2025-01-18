package com.curso.teste_database;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		Curso curso1 = new Curso("Arquitetura e Urbanismo", "Sei lá");
		Curso curso2 = new Curso("Economia", "Finanças");
		Curso curso3 = new Curso("Sistemas de Informação", "Computação");
		Curso curso4 = new Curso("Engenharia de Software", "Engenharia, Computação");
		Curso curso5 = new Curso("Ciência da Computação", "Computação");
		Curso curso6 = new Curso("Medicina", "Saúde");
		Curso curso7 = new Curso("Educação Física", "Saúde");
		Curso curso8 = new Curso("engenharia da Computação", "Engenharia, Computação");
		Curso curso9 = new Curso("Engenharia Civil", "Engenharia");
		

		List<Curso> cursos = Arrays.asList
		(
		 curso1, curso2, curso3,
		 curso4, curso5, curso6,
		 curso7, curso8, curso9
		);
		cursoRepository.saveAll(cursos);
		
		// curso1.setName("Agronomia");
		// cursoRepository.save(curso1);

		// cursoRepository.delete(curso2);
		// cursoRepository.deleteById(3);

		// List<Curso> listaDeCursos = cursoRepository.findAll();
		// listaDeCursos.forEach(curso -> System.out.println(curso));

		// System.out.println("Total de cursos: " + "(" +listaDeCursos.size() + ")");

		// Optional<Curso> cursoProcurado = cursoRepository.findById(5);
		// Curso cursoFinal = cursoProcurado.orElse(null);
		// System.out.println("Nome do curso procurado: " + cursoFinal.getName());

		// List<Curso> cursoPorNome = cursoRepository.findCursoByName("Medicina");
		// cursoPorNome.forEach(curso -> System.out.println(curso));

		// List<Curso> cursoPorNomeContendo = cursoRepository.findCursoByNameContaining("E");
		// cursoPorNomeContendo.forEach(curso -> System.out.println(curso));

		// List<Curso> cursoPorNomeLike = cursoRepository.findCursoByNameLike("%Engenharia%");
		// cursoPorNomeLike.forEach(curso -> System.out.println(curso));

		// List<Curso> cursoPorNomeLikeIgnoreCase = cursoRepository.findCursoByNameLikeIgnoreCase("%Engenharia%");
		// cursoPorNomeLikeIgnoreCase.forEach(curso -> System.out.println(curso));

		// List<Curso> cursoFindByQueryName = cursoRepository.findByQueryName();
		// cursoFindByQueryName.forEach(curso -> System.out.println(curso));
		
		// List<String> cursoFindByQueryArea = cursoRepository.findByQueryNamePorArea();
		// cursoFindByQueryArea.forEach(curso -> System.out.println(curso));

		// List<String> cursoFindByQueryAreaInformada = cursoRepository.findByQueryNamePorAreaInformada("%Engenharia%");
		// cursoFindByQueryAreaInformada.forEach(curso -> System.out.println(curso));

		// List<String> cursoFindByQueryAreaECursoInformada = cursoRepository.findByQueryNamePorAreaECursoInformada("%Engenharia%", "engenharia da Computação");
		// cursoFindByQueryAreaECursoInformada.forEach(curso -> System.out.println(curso));
		
		// List<String> cursoFindByQueryAreaParametros = cursoRepository.findByQueryNamePorAreaParametros("%Engenharia%", "engenharia da Computação");
		// cursoFindByQueryAreaParametros.forEach(curso -> System.out.println(curso));

		// System.out.println("Aguardando 10 segundos");
		// Thread.sleep(10000);

		curso1.setName("Agronomia");
		cursoRepository.save(curso1);
	}
}
