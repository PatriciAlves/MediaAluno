package classes;

public class Aluno {

    public String nome;
    public String classe;


    Disciplina disciplina = new Disciplina();




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

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }

    //metodo media aluno
    public double getMediaNota(){
        return (disciplina.getNota1() + disciplina.nota2 + disciplina.nota3 + disciplina.nota4)/ 4;
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
