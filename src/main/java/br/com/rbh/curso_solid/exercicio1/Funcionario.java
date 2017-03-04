package br.com.rbh.curso_solid.exercicio1;

import java.util.Calendar;

public class Funcionario {

	private int id;
	private String nome;
	private Cargo cargo;
	private Calendar dataDeAdmissao;
	private double salarioBase;

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public double calculaSalario() {
		return cargo.getRegra().calcula(this);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Calendar getDataDeAdmissao() {
		return dataDeAdmissao;
	}
}
