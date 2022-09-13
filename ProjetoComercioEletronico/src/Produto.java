import jdk.swing.interop.SwingInterOpUtils;

//Definir meu novo tipo de dado que será usado por outras classes / programas java
public class Produto {

    int codigo;
    String descricao;
    double preco;

     void mostrarAnuncio() {
        System.out.println("----------PRODUTO EM OFERTA----------");
        System.out.println(codigo + ":" + descricao);
        System.out.printf("R$ %.2f\n" , preco);
    }

    void modificarPreco(double novoPreco){
        this.preco = novoPreco;
    }

    void aplicarDesconto( double percentual){
        this.preco = this.preco - (this.preco * percentual / 100);
    }

    double simularDesconto(double percentual){
        double precoSimulado;
        precoSimulado = this.preco - (this.preco * percentual / 100);
        return precoSimulado;
    }
}
