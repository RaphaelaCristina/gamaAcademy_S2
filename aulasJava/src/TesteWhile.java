import java.util.Scanner;

public class TesteWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;
        valor = scanner.nextInt();

        int contador = 1;

        while(contador <= 10){
            System.out.println(valor + " X " + contador + " = " + (valor*contador));
            contador++;
        }

        scanner.close();
    }
}
