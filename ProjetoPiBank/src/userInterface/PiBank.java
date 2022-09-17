package userInterface;

import model.Conta;
import model.ContaEspecial;

public class PiBank {

    public static void main(String[] args) {

        Conta c1 = new Conta("Raphaela", "222-222-222-22", 1484,  100);
        System.out.println(c1);

        Conta c2 = new ContaEspecial ("José", "424-424-424-24", 9876,  100, 100);
        System.out.println(c2);

        c1.debitar(80);
        c2.debitar(180);

        System.out.println(c1);
        System.out.println(c2);

    }
}
