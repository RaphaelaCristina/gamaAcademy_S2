import java.util.Scanner;

public class ExercicioQuadradoEAoCubo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N;
        N = scanner.nextInt();

        for(int cont = 1; cont <= N; cont++) {
            System.out.println(cont + " " + (cont * cont) + " " + (cont * cont * cont));
        }

        scanner.close();
    }
}
