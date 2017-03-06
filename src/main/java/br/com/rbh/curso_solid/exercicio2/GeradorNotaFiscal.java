package br.com.rbh.curso_solid.exercicio2;

import java.util.List;

public class GeradorNotaFiscal {

	private List<AcaoAposGerarNota> acoes;

	public GeradorNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}
	
	public NotaFiscal gera(Fatura fatura) {
		double valor = fatura.getValorMensal();
		
		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
		
		for(AcaoAposGerarNota acao : acoes) {
			acao.executa(nf);
		}
		
		return nf;
	}
	
	private double impostoSimplesSobreO(double valor) {
		return valor * 0.6;
	}
}
