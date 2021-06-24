package com.company;

import classes.Aluno;
import classes.Disciplina;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String nome = JOptionPane.showInputDialog("Nome do Aluno(a): ");
        String classe = JOptionPane.showInputDialog("Classe do Aluno: ");

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setClasse(classe);

        for (int pos = 1; pos<= 4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina: " + pos + "?");
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + "?");

            Disciplina disciplina = new Disciplina();
            disciplina.setDisciplina(nomeDisciplina);
            disciplina.setNota(Double.valueOf(notaDisciplina));

            aluno.getDisciplinas().add(disciplina);

        }

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Classe: " + aluno.getClasse());
        System.out.println("Media da nota: " + aluno.getMediaNota());
        System.out.println("Resultado: " + (aluno.getAlunoStatus() ? "Aluno aprovado!" : "Aluno reprovado!"));
        System.out.println("__________________________________________________________");
        System.out.println("Relatorio do aluno: " + aluno.getDisciplinas());

    }
}
