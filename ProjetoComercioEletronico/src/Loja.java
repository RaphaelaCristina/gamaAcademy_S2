import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Loja {

    public static void main(String[] args) {

        Produto p, p2, p3; //declarei
        p = new Produto(123, "Computador" , 2500); //aloquei a memória para isso
        p2 = new Produto(1234, "Mouse", 70.00); //aloquei a memória para isso
        p3= new Produto(654, "Teclado", 120.00); //aloquei a memória para isso

//        p.setCodigo(123);
//        p.setDescricao("Computador");
//        p.setPreco(2500.00);
//
//        p2.setCodigo(1234);
//        p2.setDescricao("Mouse");
//        p2.setPreco(70.00);
//
//        p3.setCodigo(654);
//        p3.setDescricao("Teclado");
//        p3.setPreco(120.00);

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
        System.out.println("O preço do " + p.getDescricao() + " com mais 15% de desconto fica R$" + precoP);
        p.mostrarAnuncio(); //O preço continua de 2250,00 pois o método apenas simulou e não aplicou o desconto
    }
}
