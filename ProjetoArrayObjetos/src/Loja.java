import java.util.ArrayList;

public class Loja {

    public static void main(String[] args) {

//        Produto lista[];
//        lista = new Produto[5];
//
//        lista[0] = new Produto(1, "Computador", 1500.00);
//        lista[1] = new Produto(2, "Mouse", 30.00);
//        lista[2] = new Produto(3, "Teclado", 80);
//        lista[3] = new Produto(4, "Monitor", 400);
//        lista[4] = new Produto(5, "Impressora", 650.00);

//        for(int contador = 0; contador < lista.length; contador++ ){
//            System.out.println(lista[contador]);
//        }

        ArrayList<Produto> lista; //Lista de produto
        lista = new ArrayList<Produto>();

        lista.add(new Produto(1, "Computador", 1500.00));
        lista.add(new Produto(2, "Mouse", 30.00));
        lista.add(new Produto(3, "Teclado", 80));
        lista.add(new Produto(4, "Monitor", 400));
        lista.add(new Produto(5, "Impressora", 650.00));

        for (Produto p : lista) {
            System.out.println(p);
        }

        System.out.println(" ");

        lista.remove(2); //remover elemento da posição 2 que é o teclado

        for (Produto p : lista) {
            System.out.println(p);
        }

        System.out.println(" ");

        lista.remove(2); //remover elemento da posição 2 que é o monitor, pois ele reorganizou a lista

        for (Produto p : lista) {
            System.out.println(p);
        }

        //for tradicional
//        for(int contador = 0; contador < lista.size(); contador++){
//            System.out.println(lista.get(contador));
//        }
    }
}
