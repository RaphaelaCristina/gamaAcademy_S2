import java.util.Scanner;

public class DiversasLeituras {

    public static void main(String[] args) {
        int codigo;
        double preco;
        String nome, texto;

        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o código: ");
        texto = teclado.nextLine();
        codigo = Integer.parseInt(texto);

        System.out.println("Digite o preço: ");
        texto = teclado.nextLine();
        preco = Double.parseDouble(texto);

        System.out.println("Digite o nome: ");
        nome = teclado.nextLine();

        System.out.println("Você digitou " + codigo + " - " + nome + " R$ " + preco);

        teclado.close();

    }


}
