package com.curso.teste_database.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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

    @Column(nullable = false)
    private String area;

    @CreationTimestamp
    @Column(name = "data_criacao")
    private LocalDateTime dataDeCriacao;

    @UpdateTimestamp
    @Column(name = "data_atualizacao")
    private LocalDateTime dataDeAtualizacao;


    @Override
    public String toString() {
        return "Curso [id=" + id + ", name=" + name + ", area=" + area + "]";
    }

    public Curso() {
    }

    public Curso(String name) {
        this.name = name;
    }

    public Curso(String name, String area) {
        this.name = name;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDateTime getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(LocalDateTime dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
    }    

    
}
