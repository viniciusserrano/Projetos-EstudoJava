import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

                // FLUXO DE ENTRADA COM ARQUIVO
                // PADRAO DECORATOR

                FileOutputStream fos = new FileOutputStream("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt"); // Estabelecemos uma Entrada
                Writer osw = new OutputStreamWriter(fos);          // Transformandos bits e bytes em caracter
                BufferedWriter bw = new BufferedWriter(osw);

                bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//              bw.newLine();
                bw.newLine();
                bw.write("asdw asdfasdf sadfawefd dfs dfdfdfd ");
                bw.close();
            }

        }

