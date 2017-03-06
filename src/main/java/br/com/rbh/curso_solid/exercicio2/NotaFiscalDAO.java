package br.com.rbh.curso_solid.exercicio2;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco");
	}
}
