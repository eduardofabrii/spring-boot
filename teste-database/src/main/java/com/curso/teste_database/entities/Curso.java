package com.curso.teste_database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso_faculdade") // Mapeia por nome da tabela
public class Curso {

    @Id // Ve qual é a chave primária da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_curso", nullable = false)
    private String nome;


    
    @Override
    public String toString() {
        return "Curso [id=" + id + ", nome=" + nome + "]";
    }

    public Curso() {

    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
}
