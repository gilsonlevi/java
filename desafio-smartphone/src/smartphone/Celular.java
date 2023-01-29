package smartphone;

public class Celular implements Eletronico {
	private String fabricante;
	private String modelo;
	private double capacidadeMemoria;
	private boolean estaLigado;

	public Celular(String umFabricante, String umModelo, double umaMemoria) {
		this.fabricante = umFabricante;
		this.modelo = umModelo;
		this.capacidadeMemoria = umaMemoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCapacidadeMemoria() {
		return capacidadeMemoria;
	}

	public void setCapacidadeMemoria(double capacidadeMemoria) {
		this.capacidadeMemoria = capacidadeMemoria;
	}

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	@Override
	public void ligar() {
		this.estaLigado = true;
	}

	@Override
	public void desligar() {
		this.estaLigado = false;
	}

}