package br.com.rbh.curso_solid.exercicio5;

public class ContaDeEstudante {

	private ManipuladorDeSaldo manipulador;
	private int milhas;
	
	public ContaDeEstudante(double saldo) {
		manipulador = new ManipuladorDeSaldo(saldo);
	}
	
	public void deposita(double valor) {
		this.milhas += (int) valor;
		manipulador.deposita(valor);
	}
	
	public int getMilhas() {
		return milhas;
	}
	
	public double getSaldo() {
		return manipulador.getSaldo();
	}
}
