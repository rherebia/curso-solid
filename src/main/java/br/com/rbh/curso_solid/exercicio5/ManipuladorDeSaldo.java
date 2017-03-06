package br.com.rbh.curso_solid.exercicio5;

public class ManipuladorDeSaldo {

	private double saldo;
	
	public ManipuladorDeSaldo(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void rende(double taxa) {
		this.saldo *= taxa;
	}
}
