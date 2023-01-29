package smartphone;

import java.util.ArrayList;

public class Smartphone extends Celular implements ISmartphone {

	ArrayList<App> aplicativos = new ArrayList<>();

	public ArrayList<App> getAplicativos() {
		return aplicativos;
	}

	public void setAplicativos(ArrayList<App> aplicativos) {
		this.aplicativos = aplicativos;
	}

	public Smartphone(String umFabricante, String umModelo, double umaMemoria) {
		super(umFabricante, umModelo, umaMemoria);
	}

	public void exibirAppsInstalados() {
		boolean encontrou = false;
		for (int i = 0; i < aplicativos.size(); i++) {
			if (aplicativos.get(i) != null) {
				App app = aplicativos.get(i);
				System.out.println(app.getTitulo());
				System.out.println(app.getFabricante());
				System.out.println(app.getTamanhoEmMB());
				encontrou = true;

			}
		}
		if (!encontrou) {
			System.out.println("Nenhum aplicativo encontrado!");
		}
	}

	private double recuperarMemoriaDisponivel() {
		return getCapacidadeMemoria();
	}

	@Override
	public void instalarApp(App umApp) {
		if (isEstaLigado() == true) {
			if (getCapacidadeMemoria() - umApp.getTamanhoEmMB() > 0) {
				aplicativos.add(umApp);
				setCapacidadeMemoria(getCapacidadeMemoria() - umApp.getTamanhoEmMB());
			} else
				System.out.println("O smartphone não tem memoria suficiente!!");
		} else
			System.out.println("Ligue o smartphone!");

	}

	@Override
	public void desinstalar(App umApp) {
		boolean desinlatou = false;
		for (int i = 0; i < aplicativos.size(); i++) {
			if (aplicativos.get(i).getTitulo().equals(umApp.getTitulo())) {
				aplicativos.remove(i);
				desinlatou = true;
				break;
			}
		}

		if (!desinlatou) {
			System.out.println("Não foi possivel encontrar um aplicativo com esse nome!");
		}
	}

	@Override
	public App recuperarAppsInstalados() {
		return null;
	}

}
