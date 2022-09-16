public class Empregado {

    private String nome;
    private double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String exibir(){
        return this.nome + " R$" + this.salario;
    }

    public void aumentarSalario(double percentual){
        double salarioComAumento = this.salario + ((this.salario * percentual) / 100);
        setSalario(salarioComAumento);
    }
}
