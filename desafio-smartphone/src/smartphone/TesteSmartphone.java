package smartphone;

public class TesteSmartphone {
	public static void main(String[] args) {
		Smartphone phone = new Smartphone("Samsung", "Galaxy02", 1000);

		App app = new App("Apple", "Jogo da Cobrinha", 400);
		App app2 = new App("Apple", "MineCraft", 700);

		phone.desligar();
		phone.ligar();

		phone.instalarApp(app);
		phone.instalarApp(app2);

		System.out.println("Apss instalados: ");
		phone.exibirAppsInstalados();

		phone.desinstalar(app2);

		System.out.println("");

		System.out.println("Apss instalados: ");
		phone.exibirAppsInstalados();

	}
}
