public class ClassequeUsa {

    public static void main(String[] args) {

        InterfaceServico i;

        //Instância anônima
        i = new InterfaceServico() {
            @Override
            public void executa(int valor) {
            System.out.println("Estou executando algo..." + valor);
            }
        };

        i.executa(10);

        //Lambda
        InterfaceServico i2 = (valor) -> {
            System.out.println("Outra lógica..." + valor);
        };

        i2.executa(22);
    }
}
