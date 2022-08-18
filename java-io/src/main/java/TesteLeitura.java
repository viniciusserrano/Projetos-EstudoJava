import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

                // FLUXO DE ENTRADA COM ARQUIVO
                // PADRAO DECORATOR

                FileInputStream fis = new FileInputStream("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem.txt"); // Estabelecemos uma Entrada
                Reader isr = new InputStreamReader(fis);          // Transformandos bits e bytes em caracter
                BufferedReader br = new BufferedReader(isr);

                String linha = br.readLine();

                while (linha != null) {

                    System.out.println(linha);
                    linha = br.readLine();
                }
                br.close();
            }

        }

