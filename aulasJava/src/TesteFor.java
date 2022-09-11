import java.util.Scanner;

public class TesteFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;
        valor = scanner.nextInt();

        for(int contador = 1; contador <= 10 ; contador++){
            System.out.println(valor + " X " + contador + " = " + (valor*contador));
        }
    }
}
