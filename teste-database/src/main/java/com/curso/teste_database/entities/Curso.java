package com.curso.teste_database.entities;

import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;
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

    @NonNull @jakarta.validation.constraints.NotNull(message = "O nome do usuario nao pode ser nulo")
    @NotBlank(message = "O nome do usuario nao pode estar em branco")
    private String usuario;

    @Transient
    private BigDecimal valorDoCurso;

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

    @PrePersist
    private void antesDePersistirDados() {
        this.usuario = "";
    }

    @PostPersist
    private void aposPersistirDados() {
        this.name = this.name + " POST";
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getValorDoCurso() {
        return valorDoCurso;
    }

    public void setValorDoCurso(BigDecimal valorDoCurso) {
        this.valorDoCurso = valorDoCurso;
    }    

    
}
