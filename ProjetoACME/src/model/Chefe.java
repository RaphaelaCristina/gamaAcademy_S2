package model;

public class Chefe extends Funcionario {

    private  double salarioBase;
    private double adicionaFuncao;
    private double beneficioTerno;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAdicionaFuncao() {
        return adicionaFuncao;
    }

    public void setAdicionaFuncao(double adicionaFuncao) {
        this.adicionaFuncao = adicionaFuncao;
    }

    public double getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(double beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    public Chefe(int numRegistro, String nome, double salarioBase, double adicionaFuncao, double beneficio) {
        super(numRegistro, nome);
        this.salarioBase = salarioBase;
        this.adicionaFuncao = adicionaFuncao;
        this.beneficioTerno = beneficio;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + salarioBase * adicionaFuncao/100 + beneficioTerno;
    }
}
