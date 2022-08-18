import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        // FLUXO DE ENTRADA COM ARQUIVO
        // PADRAO DECORATOR

//                FileOutputStream fos = new FileOutputStream("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt"); // Estabelecemos uma Entrada
//                Writer osw = new OutputStreamWriter(fos);          // Transformandos bits e bytes em caracter
//                BufferedWriter bw = new BufferedWriter(osw);

//                PrintStream ps = new PrintStream(new File("lorem2.txt"));
//                ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");

        PrintWriter ps = new PrintWriter("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt");
        ps.println();
        ps.println();
        ps.println();
        ps.println("asdw asdfasdf sadfawefd dfs dfdfdfd ");

        ps.close();
    }

}

