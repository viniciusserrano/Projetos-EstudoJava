package ed.fila;

import java.util.LinkedList;
import java.util.Queue;

public class TesteDaFila {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adiciona("mauricio");
        fila.adiciona("guilherme");

        System.out.println(fila);

        String x1 = fila.remove();

        System.out.println(x1);
        System.out.println(fila);

        System.out.println("<------------------------------------------------->");

        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();

        System.out.println(x2);

    }

}
