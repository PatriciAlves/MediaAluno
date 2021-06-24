package com.company;

import classes.Aluno;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String nome = JOptionPane.showInputDialog("Nome do Aluno(a): ");
        String classe = JOptionPane.showInputDialog("Classe do Aluno: ");
        String disciplina1 = JOptionPane.showInputDialog("Informe a disciplina 1: ");
        String nota1 = JOptionPane.showInputDialog("Informe a nota 1: ");
        String disciplina2 = JOptionPane.showInputDialog("Informe a disciplina 2: ");
        String nota2 = JOptionPane.showInputDialog("Informe a nota 2: ");
        String disciplina3 = JOptionPane.showInputDialog("Informe a disciplina 3: ");
        String nota3 = JOptionPane.showInputDialog("Informe a nota 3: ");
        String disciplina4 = JOptionPane.showInputDialog("Informe a disciplina 4: ");
        String nota4 = JOptionPane.showInputDialog("Informe a nota 4: ");

        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setClasse(classe);

        aluno.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno.getDisciplina().setNota4(Double.parseDouble(nota4));

        aluno.getDisciplina().setDisciplina1(disciplina1);
        aluno.getDisciplina().setDisciplina1(disciplina2);
        aluno.getDisciplina().setDisciplina1(disciplina3);
        aluno.getDisciplina().setDisciplina1(disciplina4);


        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Classe: " + aluno.getClasse());
        System.out.println("Media da nota: " + aluno.getMediaNota());
        System.out.println("Resultado: " + (aluno.getAlunoStatus() ? "Aluno aprovado!" : "Aluno reprovado!"));
        System.out.println("__________________________________________________________");
        System.out.println("Relatorio do aluno: " + aluno.getDisciplina());

    }
}
