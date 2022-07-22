package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.Operacoes;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo = 1000.0;
		
		//System.out.print("Valor do primeiro deposito: ");
		Double pd = 195.0; //sc.nextDouble();
		
		Operacoes op = new Operacoes(saldo);
		
		System.out.println("Saldo: " + String.format("%.2f", op.getSaldo()));
		
		System.out.println("Sado liberado para imprestimo " + String.format("%.2f",op.saldoLiberadoEmprestimo()));
		System.out.print("Solicitação de credito especial S/N: ");
		String respostaImprestimo = sc.nextLine();
		
		System.out.println("Seu saldo do cartão é " + op.solicitacaoEmprestimo(respostaImprestimo));	
	}

}
