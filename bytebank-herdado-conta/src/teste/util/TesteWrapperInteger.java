package teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

    public static void main(String[] args) {

        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer

        Integer idadeRef = Integer.valueOf(29); // Autoboxing
        System.out.println(idadeRef.doubleValue()); // transforma em double

        System.out.println(Integer.MAX_VALUE); // Integer tem 4 bytes, 1 bit é o sinal e os outros bits deixar o numero positivo ou negativo.

        System.out.println(Integer.SIZE); // tem 32 bits

        System.out.println(Integer.BYTES); // 4bytes

        int valor = idadeRef.intValue(); //Unboxing

        String s = args[0]; //"10"

        // Integer numero = Integer.valueOf(s); // Transformando a string para um numero int
        int numero = Integer.parseInt(s);
        System.out.println(numero);


        List<Integer>numeros = new ArrayList<Integer>();
        numeros.add(29); //Autoboxing

    }

}
