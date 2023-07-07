package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ContaBanc;
import entities.ContaEsp;
import entities.ContaP;


public class AppContaBanc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scString = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		List<ContaBanc> listaContas = new ArrayList();
		
		ContaBanc cP;
		ContaBanc cE;
		
		Date now = new Date();
		
		cP = new ContaP("Renato", 001, 1000.00, now);
		cE = new ContaEsp("Isabel", 002, 2500.00, 200.00);
		
		listaContas.add(cP);
		listaContas.add(cE);
		
		System.out.println("Contas criadas: ");
		System.out.println();
				
		for (ContaBanc conta : listaContas) {
			System.out.println(conta);			
			System.out.println();
		}
		
		for(ContaBanc conta : listaContas) {
		
		
		System.out.println("Digite um valor a ser sacado (conta: " + conta.getNomeCliente() + "):");
		conta.sacar(sc.nextDouble());
		
		System.out.println("Digite um valor a ser depositado (conta: " + conta.getNomeCliente() + "):");
		conta.depositar(sc.nextDouble());
		
		System.out.println("Digite a taxa de rendimento (conta: " + conta.getNomeCliente() + "):");
		double tx = sc.nextDouble();
		conta.calcularNovoSaldo(tx);
				
		System.out.println();
		System.out.println(conta);
		System.out.println();

		}

		sc.close();
		scString.close();

	}

}
