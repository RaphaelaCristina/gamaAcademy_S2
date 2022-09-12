import java.util.Arrays;
import java.util.Scanner;

public class TesteVetores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valores[];

        valores = new double[10];

        System.out.println("Digite valores");
        for(int posicao = 0; posicao < valores.length; posicao++ ) {
            valores[posicao] = scanner.nextDouble();
        }

        System.out.println("Vou mostrar os vslores digitados todos na mesma lina: ");
        for(int posicao = 0; posicao < valores.length ; posicao++){
            System.out.printf("%.1f ", valores[posicao]);
        }
        scanner.close();
    }
}
