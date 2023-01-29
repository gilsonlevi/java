package smartphone;

public class App {
	private String titulo;
	private String fabricante;
	private double tamanhoEmMB;

	public App(String fabricante, String titulo, double memoria) {
		this.titulo = titulo;
		this.fabricante = fabricante;
		this.tamanhoEmMB = memoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getTamanhoEmMB() {
		return tamanhoEmMB;
	}

	public void setTamanhoEmMB(double tamanhoEmMB) {
		this.tamanhoEmMB = tamanhoEmMB;
	}

}
