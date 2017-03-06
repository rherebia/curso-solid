package br.com.rbh.curso_solid.exercicio2;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal nota) {
		System.out.println("envia email da nf " + nota.getId());
	}

}
