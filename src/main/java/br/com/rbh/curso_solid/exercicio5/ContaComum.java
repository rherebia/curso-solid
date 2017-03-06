package br.com.rbh.curso_solid.exercicio5;

public class ContaComum {

	private ManipuladorDeSaldo manipulador;
	
	public ContaComum(double saldo) {
		manipulador = new ManipuladorDeSaldo(saldo);
	}
	
	public void saca(double valor) {
		manipulador.saca(valor);
	}
	
	public void deposita(double valor) {
		manipulador.deposita(valor);
	}
	
	public void rende() {
		this.manipulador.rende(0.01);
	}
	
	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
