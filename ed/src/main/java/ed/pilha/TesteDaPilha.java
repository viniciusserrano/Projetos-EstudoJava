package ed.pilha;

import java.util.Stack;

public class TesteDaPilha {


    public static void main(String[] args) {
//        Pilha pilha = new Pilha();
//        pilha.push("mauricio");
//        System.out.println(pilha);
//        System.out.println("<------------------------------------------------->");
//        pilha.push("guilherme");
//        System.out.println(pilha);
//        System.out.println("<------------------------------------------------->");
//        String r1 = pilha.pop();
//        System.out.println(r1);
//
//        String r2 = pilha.pop();
//        System.out.println(r2);
//
//        System.out.println(pilha.vazia());
//        pilha.push("Marcelo");
//        System.out.println(pilha.vazia());
//
//        System.out.println(pilha);

        Stack<String> stack = new Stack<String>();
        stack.push("mauricio");
        stack.push("marcelo");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);

        System.out.println(stack);

    }

}
