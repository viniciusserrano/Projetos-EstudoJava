import java.util.ArrayList;
import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula ("Trabalhando com Array List", 21));
        javaColecoes.adiciona(new Aula ("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula ("Modelando com colecoes", 22));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        System.out.println("<--------------------->");

        System.out.println(aulas);
        

    }

}
