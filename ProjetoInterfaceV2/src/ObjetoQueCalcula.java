public class ObjetoQueCalcula implements InterfaceModulo1, InterfaceModulo2 {

    public void realizaAlgumCalculo(){
        System.out.println("Pronto... calculei!");
    }

    @Override
    public void calcularValores() {
       realizaAlgumCalculo();
    }

    @Override
    public void efetivarContas() {
     realizaAlgumCalculo();
    }
}
