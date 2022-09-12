public class TesteArgs {

    public static void main(String[] args) {

        System.out.println("Parametros passados pela linha de comando");
        for (int posicao = 0; posicao < args.length; posicao++){
            System.out.println("Param " + posicao + " = " + args[posicao]);
        }
    }
}
