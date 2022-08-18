package teste;

import modelo.Conta;
import modelo.ContaCorrente;

public class TestArrayReferencias {

    public static void main(String[] args) {


        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;


        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

//        System.out.println(cc2.getNumero());

        System.out.println(contas[1].getNumero() );
        ContaCorrente ref = (ContaCorrente) contas[1];
        System.out.println(ref.getNumero());

    }

}
