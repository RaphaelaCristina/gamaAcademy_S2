import java.util.Scanner;

public class TesteDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;
        valor = scanner.nextInt();

        int contador =1;

        do{
            System.out.println(valor + " X " + contador + " = " + (valor*contador));
            contador++;
        }while(contador <=10);

        scanner.close();
    }
}
