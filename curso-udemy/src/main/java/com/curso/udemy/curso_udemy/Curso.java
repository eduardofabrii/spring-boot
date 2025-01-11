package com.curso.udemy.curso_udemy;

public class Curso implements Runnable {
    public String mostraDados() {
        Aluno alunoA = new Aluno();
        System.out.println(alunoA.getNotaAluno(10, 1));

        Aluno alunoB = new Aluno();
        System.out.println(alunoB.getNotaAluno(10, 0));

        String valor = "Olá!";
        
        return valor;
    }

    @Override
    public void run() {
        
    }
}
