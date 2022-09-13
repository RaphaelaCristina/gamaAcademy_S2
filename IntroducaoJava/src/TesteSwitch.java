import java.util.Scanner;

public class TesteSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;
        valor = scanner.nextInt();

        switch (valor){
            case 1:
                System.out.println("Digitou valor 1");
                break;
            case 2:
                System.out.println("Digitou valor 2");
                break;
            case 3:
                System.out.println("Digitou valor 3");
                break;
            default:
                System.out.println("Digitou outro valor");
                break;
        }

        scanner.close();
    }
}
