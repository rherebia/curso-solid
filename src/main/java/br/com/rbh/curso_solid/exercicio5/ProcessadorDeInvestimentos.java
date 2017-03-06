package br.com.rbh.curso_solid.exercicio5;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (Object conta : contasDoBanco()) {
        	if (conta instanceof ContaComum) {
        		ContaComum contaComum = (ContaComum) conta;
        		
        		
	            contaComum.rende();
	
	            System.out.println("Novo Saldo:");
	            System.out.println(contaComum.getSaldo());
        	} else if (conta instanceof ContaDeEstudante) {
        		ContaDeEstudante contaComum = (ContaDeEstudante) conta;
        		
	            System.out.println("Novo Saldo:");
	            System.out.println(contaComum.getSaldo());
        	}
        }
    }

    private static List<Object> contasDoBanco() {
        return Arrays.asList(new ContaComum(100), new ContaComum(150), new ContaDeEstudante(200));
    }

}