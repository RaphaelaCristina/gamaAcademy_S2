public class MeuSistema {

    public static void main(String[] args) {

        InterfaceBD ibd; //declarando como interface

        //ibd = new BdAccess(); //instanciando objeto

        ibd = new BdMysql();

        //Vou conectar no banco de dados
        ibd.conectar();

        //Vou recuperar dados
        ibd.executar("SELECT* FROM tb_clientes ");

        //Vou desconectar
        ibd.desconectar();
    }
}
