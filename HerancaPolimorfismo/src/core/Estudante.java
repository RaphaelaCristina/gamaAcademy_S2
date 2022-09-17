package core;
//SUBCLASSE
public class Estudante extends Pessoa {

    //Herdando o construtor da superclasse e atribuindo os atributos da subclasse
    public Estudante(String nome, String email, String telefone, int numeroMatricula, String curso){
        super(nome, email, telefone);
        this.numeroMatricula = numeroMatricula;
        this.curso = curso;
    }

    private int numeroMatricula;
    private String curso;

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

//Sobrescrita = redefinição de método
    @Override
    public String exibirInfo() {
        return super.exibirInfo() + " / " + this.numeroMatricula + " / " + this.curso;
    }
}
