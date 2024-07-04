package br.banco.contaBancaria;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class contas {

	private List<contaBancaria> contas = new ArrayList<>();

	public String addConta(contaBancaria cb) {

			if (cb != null) {
				contas.add(cb);
				return "Cadastro efetuado com sucesso.";	
			}
			else {
				return "Não foi possível realizar o cadastro.";
			}
	}

	public String listarConta(int numConta) {

		for (contaBancaria cb : contas) {
			if (numConta == cb.getNumConta()) {
				System.out.println("\nConta encontrada.\n" + 
					"Nome: " + cb.getNome() + "\n" + 
					"Idade: " + cb.getIdade()+ "\n" + 
					"Número da conta: " + cb.getNumConta() + "\n" + 
					"Saldo: " + cb.getSaldo() + "\n");
			}
			else {
				System.out.println("\nConta não encontrada :(");
			}
		}
		return null;
	}
	
	public String excluirConta(int numConta) {
		
		contaBancaria cbExcluir = null;

		System.out.println("Buscando conta ...");
			for (contaBancaria cb : contas) {
				if(numConta == cb.getNumConta()) {
					cbExcluir = cb;
				}
				else {
					System.out.println("\nConta não encontrada.");
				}
			}
			contas.remove(cbExcluir);
			return "\nConta encerrada com sucesso.";
	}
	
	public double exibirSaldo(int numConta) {
		for(contaBancaria cb : contas){
			
			if(numConta == cb.getNumConta()) {
				return cb.getSaldo();
			}
		}
		return 0.0;
	}
	
	public String depositarConta(int numConta, double valor) {
		
		for(contaBancaria cb : contas) {
			
			if(numConta == cb.getNumConta()) {
				cb.depositar(valor);
				System.out.println("Depósito efetuado com sucesso.");
			}
		}
		
		return null;
	}
	
public String sacarConta(int numConta, double valor) throws saldoInsuficienteException {
		
		for(contaBancaria cb : contas) {
			
			if(numConta == cb.getNumConta()) {
				cb.sacar(valor);
				System.out.println("Saque efetuado com sucesso.");
			}
		}
		
		return null;
	}
}
