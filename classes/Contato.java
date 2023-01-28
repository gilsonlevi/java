package Exercicio001;

public class Contato {
	
	
	private String nome;
	private String email;
	private String telefone;
	
	public void alterarNome(String  novoNome) {
		this.nome = novoNome;
	}
	
	public void alterarEmail(String  novoEmail) {
		this.email = novoEmail;	
	}
	
	public void alterarTelefone(String  novoTelefone) {
		this.telefone = novoTelefone;	
	}
	
	public String verNome() {
		return nome;
	}
	
	public String verEmail() {
		return email;
	}
	
	public String verTelefone() {
		return telefone;
	}
	
	/*@Override
	public String toString() {
		return "* Nome: " + nome + "\n* Email: " + email + "\n* Telefone: " + telefone;
	}
	*/

}

