import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        /*Crie um programa que receba um dos lados de um quadrado e calcule sua área*/

        Scanner scanner = new Scanner(System.in);

        int lado, area;

        System.out.println("Digite o lado do quadrado");
        lado = scanner.nextInt();

        area = lado * lado;
        System.out.println("A área do quadrado de lado " + lado + " é: " + area);

        scanner.close();
    }
}
