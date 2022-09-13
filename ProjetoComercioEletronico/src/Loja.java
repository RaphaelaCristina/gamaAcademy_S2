import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Loja {

    public static void main(String[] args) {

        Produto p, p2, p3; //declarei
        p = new Produto(); //aloquei a memória para isso
        p2 = new Produto(); //aloquei a memória para isso
        p3= new Produto(); //aloquei a memória para isso

        p.codigo = 123;
        p.descricao = "Computador";
        p.preco = 2500.00;

        p2.codigo = 1234;
        p2.descricao = "Mouse";
        p2.preco = 70.00;

        p3.codigo = 654;
        p3.descricao = "Teclado";
        p3.preco = 120.00;

        System.out.println("-------Preços antes dos descontos -------");

        p.mostrarAnuncio();

        p2.mostrarAnuncio();

        p3.mostrarAnuncio();

        System.out.println("*******************************************");

        System.out.println("----PREÇOS DEPOIS DO DESCONTO-----");

        p.aplicarDesconto(10);
        p.mostrarAnuncio();

        p2.modificarPreco(55);
        p2.mostrarAnuncio();

        p3.modificarPreco(99.90);
        p3.mostrarAnuncio();

        //Simulando descontos
        double precoP = p.simularDesconto(15);
        System.out.println("O preço do " + p.descricao + " com mais 15% de desconto fica R$" + precoP);
        p.mostrarAnuncio(); //O preço continua de 2250,00 pois o método apenas simulou e não aplicou o desconto
    }
}
