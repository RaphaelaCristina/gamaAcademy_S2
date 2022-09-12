import java.util.Scanner;

public class TesteMatrizes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double matriz[][];
        matriz = new double[3][5]; //matriz com 3 linhas e 5 colunas

        for(int linha = 0; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.print("Digite o valor da matri[" + linha + "] [" + coluna + "] = ");
                matriz[linha][coluna] = scanner.nextDouble();
            }
            System.out.println();
        }

        System.out.println("Agora vou imprimir a matriz como matriz de verdade ");
        for(int linha = 0; linha < 3 ; linha++){
            for(int coluna = 0; coluna < 5; coluna++){
                System.out.printf("%10.2f" , matriz[linha][coluna]);
            }
            System.out.println();
        }

        scanner.close();

    }
}
