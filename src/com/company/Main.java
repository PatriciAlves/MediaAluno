package com.company;

import classes.Aluno;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Aluno aluno1 = new Aluno();
        aluno1.setNome("Patricia");
        aluno1.setNota1(95.0);
        aluno1.setNota2(85);
        aluno1.setNota3(75);
        aluno1.setNota4(60);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Media da nota: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoStatus2());

    }
}
