package userInterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Raphaela", "raphitasp@umdoistres.com", "960706070");
//        p.setNome("Raphaela");
//        p.setEmail("raphitasp@umdoistres.com");
//        p.setTelefone("960706070");
        System.out.println(p.exibirInfo());

        Estudante e = new Estudante("José","joselalala@jose.com", "987654321",12345 ,"ADS");
//        e.setNome("José");
//        e.setEmail("joselalala@jose.com");
//        e.setTelefone("987654321");
//        e.setNumeroMatricula(12345);
//        e.setCurso("ADS");
        System.out.println(e.exibirInfo());
    }
}
