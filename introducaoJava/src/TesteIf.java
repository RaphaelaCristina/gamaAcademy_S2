import java.util.Scanner;

public class TesteIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Digite a nota 1: ");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2 )/2;

        System.out.println("Sua média final vale: " + media);

        if(media >= 6){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

        scanner.close();


    }
}
