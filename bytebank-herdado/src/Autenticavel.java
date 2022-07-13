//Contrato Autenticavel
//quem assina esse contrato precisa implementar 
//metodo setsenha
//metodo autentica

public abstract interface Autenticavel {

	
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha); 
		
}
