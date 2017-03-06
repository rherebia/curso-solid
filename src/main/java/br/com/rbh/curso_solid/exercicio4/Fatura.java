package br.com.rbh.curso_solid.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }
    
    public void adiciona(Pagamento pagamento) {
    	this.pagamentos.add(pagamento);
    	
    	if (valorPagamentos() >= valor) {
    		pago = true;
    	}
    }

    private double valorPagamentos() {
    	double total = 0;
    	
    	for(Pagamento p : pagamentos) {
    		total += p.getValor();
    	}
    	
		return total;
	}

	public boolean isPago() {
        return pago;
    }

}