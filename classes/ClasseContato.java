package Exercicio001;

public class ClasseContato {

	public static void main(String[] args) {
		Contato contato1 = new Contato();
		contato1.alterarNome("Levi");
		contato1.alterarEmail("Levi@email.com");
		contato1.alterarTelefone("3298651");
		
		Contato contato2 = new Contato();
		contato2.alterarNome("Lucas");
		contato2.alterarEmail("Lucas@email.com");
		contato2.alterarTelefone("1234567");
		
		Contato contato3 = new Contato();
		contato3.alterarNome("Matheus");
		contato3.alterarEmail("Mat@email.com");
		contato3.alterarTelefone("12345");
		
		Agenda minhaAgenda = new Agenda();
		
		minhaAgenda.adicionarNovoContato(contato1);
		minhaAgenda.adicionarNovoContato(contato2);
		minhaAgenda.adicionarNovoContato(contato3);
		
		Contato lucas = minhaAgenda.verContato("Lucas");
		if(lucas != null) {
			System.out.println(lucas);
		}else 
			System.out.println("Contato não encotrado");
		
		
	}

}
