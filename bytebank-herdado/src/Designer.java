// Gerente herda da class Funcionario, pois ele e um funcionario


public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o m�todo de bonificacao do Designer");
		return 200;
	}
	
}
