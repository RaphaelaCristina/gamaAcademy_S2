package model;

public class Conta {

    protected String nomeTitular;
    protected String cpf;
    protected int numeroConta;
    protected float saldo;

    public Conta(String nomeTitular, String cpf, int numeroConta, float saldo) {
        super();
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean debitar(float valor){
        if(this.saldo  >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }

    }

    public void creditar(float valor){
        this.saldo += valor;
    }

    @Override
    public String toString(){
        return numeroConta + " - " + nomeTitular + " - " + " (" + cpf + ") R$" + saldo;
    }

}
