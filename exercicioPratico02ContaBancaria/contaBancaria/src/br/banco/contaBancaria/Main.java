package br.banco.contaBancaria;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.random.*;

public class Main {

	public static void main(String args[]) throws IOException, saldoInsuficienteException {
		
		contas conta = new contas();
	
		int escolha = 0;
		boolean continuar = true;
		
		while(continuar) {
			System.out.println("1 - Adicionar conta bancária.\n2 - Remover uma conta bancária.\n" + 
			"3 - Consultar saldo\n4 - Listar uma conta\n5 - Depositar\n6 - Sacar\n7 - Sair\n");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Escolha uma opção: ");
			
			escolha = Integer.parseInt(reader.readLine());
			
			switch (escolha) {
			
			case 1: 
				String nome;
				int idade;
				double saldo;
				int numConta;
				double valor;
				
				System.out.println("Digite o nome do titular: ");
				nome = reader.readLine();
				
				System.out.println("Digite a idade do titular: ");
				idade = Integer.parseInt(reader.readLine());
				
				System.out.println("Digite o valor do depósito inicial: ");
				saldo = Double.parseDouble(reader.readLine());
				
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				contaBancaria cb = new contaBancaria(numConta, saldo, nome, idade);
				
				System.out.println(conta.addConta(cb));
				
				break;
				
			case 2:
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				System.out.println(conta.excluirConta(numConta));
				
				break;
				
			case 3:
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				System.out.println(conta.exibirSaldo(numConta));
				
				break;
				
			case 4: 
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				System.out.println(conta.listarConta(numConta));
				
				break;
				
			case 5: 
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				System.out.println("Digite o valor a ser depositado :");
				valor = Double.parseDouble(reader.readLine());
				
				System.out.println(conta.depositarConta(numConta, valor));
				
				break;
				
			case 6:
				System.out.println("Digite o número da conta: ");
				numConta = Integer.parseInt(reader.readLine());
				
				System.out.println("Digite o valor a ser sacado :");
				valor = Double.parseDouble(reader.readLine());
				
				System.out.println(conta.sacarConta(numConta, valor));
				
				break;
				
			case 7: 
				continuar = false;
				break;
			}
		}
	}
}
