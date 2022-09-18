public class AplicacaoQueUsaCalculo {

    public static void main(String[] args) {

        //Situação 1- preciso chamar o método do objeto do jeito que ele é

        ObjetoQueCalcula o = new ObjetoQueCalcula();
        o.realizaAlgumCalculo();

        //Situação 2- o módulo X só consegue chamar via método calcularValores()

        InterfaceModulo1 i1 = o;
        i1.calcularValores();

        //Situação 3- o módulo Y só consegue chamar via método efetivarContas()
        InterfaceModulo2 i2 = o;
        i2.efetivarContas();
    }
}
