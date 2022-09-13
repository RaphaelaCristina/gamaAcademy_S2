import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        /*
         * * Uma empresa desenvolveu uma pesquisa
         * para saber as características psicológicas dos indivíduos de uma região.
         *
         * Para cada uma das pessoas era perguntado:
         * idade, sexo (1-feminino / 2-masculino / 3-outros), e as opções:
         * 1, se a pessoa era calma;
         * 2, se a pessoa era nervosa e
         * 3, se a pessoa era agressiva.
         *
         * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas,
         * calcule e mostre:
         * - o número de pessoas calmas;
         * - o número de mulheres nervosas;
         * - o número de homens agressivos;
         * - o número de outros calmos;
         * - o número de pessoas nervosas com mais de 40 anos
         * - o número de pessoas calmas com menos de 18 anos
         */
        // quais as variaveis
        // quais as estruturas
        // como mostrar na tela

        int pessoaNervosaMaisQuarenta = 0;
        int pessoaCalmaMenorDezoito = 0;
        int calmos = 0 ;
        int mulheresNervosas = 0;
        int homensAgressivos = 0;
        int outrosCalmos = 0;

        Scanner s = new Scanner(System.in);

        for (int cont = 0; cont < 6 ; cont ++){
            System.out.println(cont);
            System.out.println("Digite sua idade: ");
            int idade = s.nextInt();

            System.out.println("Escolha o número que corresponde ao seu sexo: \n 1 - Feminino \n 2 - Masculino \n 3 - Outros " );
            int sexo = s.nextInt();

            System.out.println("Escolha o número que corresponde ao seu humor: \n 1- Calma \n 2- Nervosa \n 3- Agressiva");
            int humor = s.nextInt();

            if(humor == 1){
                calmos += 1;
            } else if (humor == 2 && sexo == 1) {
                mulheresNervosas += 1;
            } else if (humor == 3 && sexo == 2){
                homensAgressivos += 1;
            } else if (humor == 1 && sexo == 3){
                outrosCalmos += 1;
            } else if (idade >= 40 && humor == 2){
                pessoaNervosaMaisQuarenta += 1;
            } else if (idade <= 18 && humor == 1){
                pessoaCalmaMenorDezoito += 1;
            }
        }
        System.out.println("Temos " + calmos + " pessoa(s) calma(s).");
        System.out.println("Temos " + mulheresNervosas + " mulher(es) nervosa(s).");
        System.out.println("Temos " + homensAgressivos + " homem(ns) agressivo(s).");
        System.out.println("Temos " + outrosCalmos + " outro(s) calmo(s).");
        System.out.println("Temos " + pessoaNervosaMaisQuarenta + " pessoa(s) nervosa(s) com mais de 40 anos.");
        System.out.println("Temos " + pessoaCalmaMenorDezoito + " pessoa(s) calma(s) menor(es) de 18 anos.");

        s.close();
    }
}
