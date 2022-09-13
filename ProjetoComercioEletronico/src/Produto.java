import jdk.swing.interop.SwingInterOpUtils;

//Definir meu novo tipo de dado que será usado por outras classes / programas java
public class Produto {

    private int codigo;
    private String descricao;
    private double preco;

    //Construtor para criar o objeto passando os atributos obrigatoriamente como parametro.
    public Produto(int codigo, String descricao, double preco){
       this.codigo = codigo;
       this.descricao = descricao;
       this.preco = preco;
    }

    //Construtor selecionando quais atributos eu desejo que seja obrigatorio para criar o meu objeto
    public Produto(int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = 0.00;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarAnuncio() {
        System.out.println("----------PRODUTO EM OFERTA----------");
        System.out.println(codigo + ":" + descricao);
        System.out.printf("R$ %.2f\n" , preco);
    }

    public void modificarPreco(double novoPreco){
       setPreco(novoPreco);
    }

    public void aplicarDesconto( double percentual){
        double preco = this.preco - (this.preco * percentual / 100);
        setPreco(preco);
    }

    public double simularDesconto(double percentual){
        double precoSimulado;
        precoSimulado = this.preco - (this.preco * percentual / 100);
        return precoSimulado;
    }
}
