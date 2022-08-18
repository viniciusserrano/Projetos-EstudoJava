package teste.io;

import modelo.Cliente;
import modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Vinicius");
        cliente.setProfissao("Dev");
        cliente.setCpf("23413131");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.deposita(222.3);

        ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        ops.writeObject(cc);
        ops.close();
    }
}
