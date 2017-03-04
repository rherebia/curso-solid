package br.com.rbh.curso_solid.exercicio1;

public class QuinzeOuVinteECincoPorCento implements RegraDeCalculo {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
