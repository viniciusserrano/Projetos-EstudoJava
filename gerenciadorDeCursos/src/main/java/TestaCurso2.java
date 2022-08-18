import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula ("Trabalhando com Array List", 21));
        javaColecoes.adiciona(new Aula ("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula ("Modelando com colecoes", 24));
        System.out.println("<--------------------->");

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);
        System.out.println("<--------------------->");

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


    }

}
