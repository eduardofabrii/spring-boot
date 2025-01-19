package com.curso.teste_database.entities;


import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome_materia")
    private String nome;

    @ManyToMany
    @JoinTable(     
            name = "grade_materia",
            joinColumns = { @JoinColumn(name = "materia_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "grade_id", referencedColumnName = "id") }
            )
    private Set<Grade> grades = new HashSet<>();

    public Materia() {
    }

    public Materia(String nome, Set<Grade> grades) {
        this.nome = nome;
        this.grades = grades;
    }
    
    
}
