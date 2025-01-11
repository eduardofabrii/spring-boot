package com.curso.udemy.curso_udemy;

public class Aluno {
    public int getNotaAluno(int a, int b) {

        // TODO Remover após corrigir de forma correta para o cliente
        if (b == 0) {
            b = 1;
        } 

        // FIXME Ajuste na divisão por zero
        int nota = a / b;
        return nota;
    }
}
