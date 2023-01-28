package Exercicio001;

public class Conta {
	private int conta;
	private int agencia;
	private int operacao;
	private double saldo;
	
	public double sacar(double umValor) {
		if(umValor > saldo) {
			System.out.println("O valor que você digitou é maior que o seu saldo!!!");
		} else
			saldo = saldo - umValor;
		return umValor;
			
		
	}
	
	public void depositar(double umValor) {
		this.saldo = saldo + umValor;
	}
	
	public void transferir(double umValor, Conta contaDestino) {
		 double valorSacado = sacar(umValor);
		
		contaDestino.depositar(valorSacado);
	}
	
	public double consultarSaldo() {
		return saldo;
	}
			
		
	}

