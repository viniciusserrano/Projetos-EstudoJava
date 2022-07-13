
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		
		Gerente vinicius = new Gerente();
		vinicius.setNome("Vinicius Gomes");
		vinicius.setCpf("463646948-88");
		vinicius.setSalario(2600.00);
 
		System.out.println(vinicius.getNome());
		System.out.println(vinicius.getBonificacao());
		
		
	}

}
