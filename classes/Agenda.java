package Exercicio001;

public class Agenda {
	private Contato[] contatos = new Contato[5];

	public void adicionarNovoContato(Contato umContato) {
		boolean adicionou = false;
		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] == null) {
				contatos[i] = umContato;
				adicionou = true;
				break;
			}
		}
		if (!adicionou) {
			System.out.println("Sua agenda está cheia!");
		}
	}

	public void excluircontato(Contato umContato) {
		for (int j = 0; j < contatos.length; j++) {
			if (contatos[j] != null && contatos[j].verEmail().equals(umContato.verEmail())) {
				contatos[j] = null;
				break;
			}
		}
	}

	public Contato verContato(String umNome) {
		for (int k = 0; k < contatos.length; k++) {
			Contato c = contatos[k];
			if (c != null && c.verNome().equals(umNome)) {
				return c;
			}
		}
		return null;
	}

}
