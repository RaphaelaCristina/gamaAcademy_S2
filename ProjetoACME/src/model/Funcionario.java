package model;

public abstract class Funcionario {

    protected int numRegistro;
    protected  String nome;

    public Funcionario(int numRegistro, String nome) {
        this.numRegistro = numRegistro;
        this.nome = nome;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //As classes abstratas me permitem criar as clausulas contratuais para que as subclasses
//se comprometam a implementar
    public abstract double calcularSalario();
}
