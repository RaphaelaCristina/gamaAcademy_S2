import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Loja {

    public static void main(String[] args) {

        Produto p; //declarei
        p = new Produto(); //aloquei a memória para isso

        p.codigo = 123;
        p.descricao = "computador";
        p.preco = 2500.00;

        System.out.println("--------PRODUTO---------");
        System.out.println(p.codigo + ":" + p.descricao );
        System.out.printf("R$ %.2f\n" , p.preco);
    }
}
