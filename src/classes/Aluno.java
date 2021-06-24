package classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    public String nome;
    public String classe;


    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();





    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //setters e getters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                '}';
    }

    //metodo media aluno
    public double getMediaNota(){

        double somaNotas = 0.0;
        for (Disciplina disciplina :disciplinas) {
            somaNotas += disciplina.getNota();

        }
        return somaNotas / disciplinas.size();
    }


    public boolean getAlunoStatus() {
        double media = this.getMediaNota();
        if(media >= 70) {
            return true;

        }else{
            return false;

        }
    }

}
