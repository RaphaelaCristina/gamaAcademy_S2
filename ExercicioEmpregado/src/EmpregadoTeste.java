import java.util.Scanner;

public class EmpregadoTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Empregado e1, e2;

        String nome1, nome2;
        double salario1, salario2;

        // e1 = new Empregado("Desenvolvedora Raphaela " , 5000 );
        // e2 = new Empregado("Coordenador José ", 7000);

        System.out.println("Digite o nome do primeiro empregado");
        nome1 = scanner.nextLine();

        System.out.println("Digite o salário do primeiro empregado");
        salario1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o nome do segundo empregado");
        nome2 = scanner.nextLine();

        System.out.println("Digite o salário do segundo empregado");
        salario2 = Double.parseDouble(scanner.nextLine());

        e1 = new Empregado(nome1, salario1);
        e2 = new Empregado(nome2, salario2);


        //Antes do reajuste
        System.out.println("---------Informacoes Originais---------");
        System.out.println(e1.exibir());
        System.out.println(e2.exibir());

        e1.aumentarSalario(5.0);
        e2.aumentarSalario(7.0);

        //Salários reajustados
        System.out.println("-------Informacoes Depois do Reajuste-------");
        System.out.println(e1.exibir());
        System.out.println(e2.exibir());

        scanner.close();
    }
}
