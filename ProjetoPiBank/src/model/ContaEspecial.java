package model;

import model.Conta;

public class ContaEspecial extends Conta {

    private float limite;

    public ContaEspecial(String nomeTitular, String cpf, int numeroConta, float saldo, float limite) {
        super(nomeTitular, cpf, numeroConta, saldo);
        this.limite = limite;
    }


    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public boolean debitar(float valor){
        if (super.saldo + this.limite >= valor){
            super.saldo -= valor;
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " limite R$" + this.limite;
    }


}
