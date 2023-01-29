package smartphone;

public interface ISmartphone extends Eletronico {
	public void instalarApp(App umApp);

	public void desinstalar(App umApp);

	public App recuperarAppsInstalados();

}