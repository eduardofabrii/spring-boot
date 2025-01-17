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
    private String name;
    
    @Override
    public String toString() {
        return "Curso [id=" + id + ", name=" + name + "]";
    }

    public Curso() {

    }

    public Curso(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}
