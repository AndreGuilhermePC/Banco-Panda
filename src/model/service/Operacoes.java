package model.service;

public class Operacoes {
	private Double saldo;

	public Operacoes(Double saldo) {
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) {
		this.saldo = saldo + valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo = getSaldo() - valorSaque;
	}
	
	public boolean solicitaCrataoCredito(String respostaCartao) {
		if(respostaCartao.equals("s")) {
			return true;
		}else {
			return false;
		}
	}
	
	static final double taxa = 12.0;
	public double saldocartao() {
		return  getSaldo() * taxa; 
	}	
	
	// pedir de liberação do credito	
	public boolean solicitacaoEmprestimo(String respostaEmprestimo) {
		if(respostaEmprestimo.equals("s")) {
			return true;
		}else {
			return false;
		}
	}
	
	//saldo liberado de imprestimo
	static final double taxaEmprestimo = 10.0;
	public double saldoLiberadoEmprestimo() {
		return getSaldo() * taxaEmprestimo;
	}
	
	@Override
	public String toString() {
		return "Novo Saldo: " + getSaldo();
	}
	
	
}
