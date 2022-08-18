import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

                Socket s = new Socket();


                // FLUXO DE ENTRADA COM ARQUIVO
                // PADRAO DECORATOR

                InputStream fis = s.getInputStream(); //Na esquerda usa entrada de rede criando "Socket" //System.in  usado para entrada do teclado  // Usa-se para entrada de arquivo new FileInputStream("C:\Users\vinicius.segalio\Documents\estudo\java-io\lorem.txt")
                Reader isr = new InputStreamReader(fis);     // Transformandos bits e bytes em caracter
                BufferedReader br = new BufferedReader(isr);

                OutputStream fos = s.getOutputStream(); //Na esquerda saida para Rede criando "Socket" // System.out Saida do Teclado // Usa=se para entrada de arquivo ("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\lorem2.txt"); // Estabelecemos uma Entrada
                Writer osw = new OutputStreamWriter(fos);   // Transformandos bits e bytes em caracter
                BufferedWriter bw = new BufferedWriter(osw);


                String linha = br.readLine();

                while (linha != null && !linha.isEmpty()) {

                    bw.write(linha);
                    bw.newLine();
                    bw.flush();
                    linha = br.readLine();
                }
                br.close();
                br.close();
            }

        }

