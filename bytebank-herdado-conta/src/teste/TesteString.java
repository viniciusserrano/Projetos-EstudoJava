package teste;

import java.util.Locale;

public class TesteString {

    public static void main(String[] args) {

        String vazio = "    Alura    ";
        String outroVazio = vazio.trim(); // trim tira todos os espaços da String

        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);

        String nome = "Alura";

        System.out.println(nome.length()); // quantos caracters tem minha String
        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));

        }
//        String sub = nome.substring(1);
//        System.out.println(sub);

//        int pos = nome.indexOf("ur");
//        System.out.println(pos);


//        char c = nome.charAt(2);
//        System.out.println(c);


//        char c = 'A';
//        char d = 'a';
//
//        String outra = nome.replace(c, d);
//
//        String outra = nome.replace("A", "a"); // altera as letras
//        String outra = nome.toLowerCase(); // deixa tudo minusculo
//        String outra = nome.toUpperCase();   // deixa tudo maiusculo
//        System.out.println(nome);
//        System.out.println(outra);
    }

}
