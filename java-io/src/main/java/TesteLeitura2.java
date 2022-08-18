import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("C:\\Users\\vinicius.segalio\\Documents\\estudo\\java-io\\contas.csv"));

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
//            System.out.println(linha);

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();


            String valorFormatado = String.format(new Locale("pt","BR") , "%s - %04d-%08d, %20s: %010.2f", tipoConta, agencia, numero, titular, saldo);
            System.out.println(valorFormatado);

            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(valores[3]);

        }
        scanner.close();
    }

}
