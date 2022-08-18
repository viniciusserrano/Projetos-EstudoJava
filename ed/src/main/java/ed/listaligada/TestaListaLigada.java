package ed.listaligada;

public class TestaListaLigada {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);

        lista.adiciona("Marcelo");
        System.out.println(lista);

        lista.adiciona(2, "Gabriel");
        System.out.println(lista);
        System.out.println("<------------------------------------------------->");
        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());
        System.out.println("<------------------------------------------------->");

        lista.removeDoComeco();

        System.out.println(lista );
        System.out.println(lista.tamanho());

        System.out.println("<------------------------------------------------->");
        lista.removeDoFim();
        System.out.println(lista);

        System.out.println("<------------------------------------------------->");
        lista.adiciona("Jose");
        lista.adiciona("Joao");
        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);

        System.out.println("<------------------------------------------------->");
        System.out.println(lista.contem("mauricio"));
        System.out.println(lista.contem("Danilo"));
    }

}
