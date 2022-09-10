import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        /*Crie um programa que receba a base e altura de um retângulo e calcule sua área*/

        Scanner scanner = new Scanner(System.in);

        int base, altura, area;

        System.out.println("Digite o valor da base do retângulo");
        base = scanner.nextInt();

        System.out.println("Digite o valor da altura do retângulo");
        altura = scanner.nextInt();

        area = (base * altura)/2;

        scanner.close();
    }
}
