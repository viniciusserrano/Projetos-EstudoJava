package teste;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int [] idades = new int [5]; // inicializ o array com os valores padroes "0" - "5" Seria a quantidade de posicoes que meu array irá ter

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }


        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }


//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 49;
//        idades[3] = 59;
//        idades[4] = 69;
//
//        int idade4 = idades [4];
//
//        System.out.println(idade4);
//
//        System.out.println(idades.length);

    }

}
