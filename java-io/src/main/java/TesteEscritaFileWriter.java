import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TesteEscritaFileWriter {

    public static void main(String[] args) throws IOException {

                // FLUXO DE ENTRADA COM ARQUIVO
                // PADRAO DECORATOR

//                FilesOutputStream fos = new FileOutputStream("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt"); // Estabelecemos uma Entrada
//                Writer osw = new OutputStreamWriter(fos);          // Transformandos bits e bytes em caracter
//                BufferedWriter bw = new BufferedWriter(osw);


                BufferedWriter bw = new BufferedWriter(new FileWriter ("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt"));
                bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
                bw.newLine();
                bw.newLine();
                bw.write("asdw asdfasdf sadfawefd dfs dfdfdfd ");
                bw.close();
            }

        }

