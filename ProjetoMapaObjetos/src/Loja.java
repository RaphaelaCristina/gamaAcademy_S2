import java.util.ArrayList;
import java.util.HashMap;

public class Loja {

    public static void main(String[] args) {

        /*
        Integer - int
        Double - double
        Character - char
        */

        //O HashMap não aceita tipos primitivos, então precisamos usar objetos
        HashMap<Integer, Produto> mapa;
        mapa = new HashMap<Integer, Produto>();

        mapa.put(1,(new Produto(1, "Computador", 1500.00)));
        mapa.put(2,(new Produto(2, "Mouse", 30.00)));
        mapa.put(3,(new Produto(3, "Teclado", 80)));
        mapa.put(4,(new Produto(4, "Monitor", 400)));
        mapa.put(5,(new Produto(5, "Impressora", 650.00)));

        int codigoABuscar = 6;
        Produto p = mapa.get(codigoABuscar);
        if( p != null){
            System.out.println("Encontrei: " + p);
        }else {
            System.out.println("Não existe!");
        }
    }
}