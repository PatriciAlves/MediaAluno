package classes;

public class Aluno {

    public String nome;
    public String classe;
    public int ra;
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;





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

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }


    //metodo media aluno
    public double getMediaNota(){
        return (nota1 + nota2 + nota3 + nota4)/ 4;
    }

    public boolean getAlunoStatus() {
        double media = this.getMediaNota();
        if(media >= 70) {
            return true;

        }else{
            return false;

        }
    }
    public String getAlunoStatus2(){
        double media = this.getMediaNota();
        if (media >= 70){
            return "Aluno aprovado!";
        }else{
            return "Aluno reprovado!";
        }
    }
}
