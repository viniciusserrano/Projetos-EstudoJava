package teste;

import modelo.Cliente;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TesteObject {

    public static void main(String[] args) {

//        System.out.println("x");
//        System.out.println(3);
//        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(22, 33);
        Object cp = new ContaPoupanca(33, 22);
        Object cliente = new Cliente();



        System.out.println(cc);
        System.out.println(cp);


    }

}
