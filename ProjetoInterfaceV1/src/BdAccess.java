public class BdAccess implements InterfaceBD {

    @Override
    public void conectar() {
        System.out.println("Conectando no banco Access");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do banco Access");
    }

    @Override
    public void executar(String comando) {
        System.out.println("ms -> access " + comando);
    }
}
