import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerilizacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//        cliente.setNome("Vinicius");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("23413131");
//
//        String nome = "Vinicius";
//        ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        ops.writeObject(cliente);
//        ops.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());

    }

}
