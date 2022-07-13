// Gerente herda da class Funcionario, pois ele e um Gerente,assina contrato autenticavel, é um autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
		
	}
	
	
	public double getBonificacao() {
		System.out.println("Chamando a Bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		
	}

}
