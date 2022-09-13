import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /*Entrar com um número de 3 dígitos e invertê-los: EX:123 -> 321 */

        Scanner scanner = new Scanner(System.in);

        int numeroOriginal, centena, dezena, unidade, resto;
        int novoNumero;


        System.out.println("Digite um número inteiro de três dígitos: ");
        numeroOriginal = scanner.nextInt();

        centena = numeroOriginal/100; // ex: 234/100 = 2 , portanto centena = 2;
        resto = numeroOriginal%100; // ex: 234/10 = 34 , portanto resto = 34;
        dezena = resto/10; // ex: 34/10 = 3;
        unidade = resto%10; // ex: 34%10 = 4, portanto unidade = 4;

        novoNumero = unidade * 100 + dezena * 10 + centena ; //400 + 30 + 2

        System.out.println("O novo número é: " + novoNumero);

        scanner.close();
    }
}
