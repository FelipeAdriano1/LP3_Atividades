package br.banco.contaBancaria;

public class contaBancaria {

	private int numeroConta;
	private double saldo;
	private String nomeTitular;
	private int idade;
	
	public contaBancaria(int numConta, double saldo, String nome, int idade) {
		
		this.saldo = saldo;
		this.numeroConta = numConta;
		this.idade = idade;
		this.nomeTitular = nome;
	}
	
	public contaBancaria() {}
	
	public String depositar(double deposito) {
		
		if(deposito < 0) {
			System.out.println("Valor de depósito inválido.");
		}
		else {
			saldo += deposito;
		}
		
		return "Deposito efetuado com sucesso !";
	}
	
	public String mostrarSaldo() {
		
		return "Seu saldo é de R$: " + saldo;
	}
	
	public String sacar(double valor) throws saldoInsuficienteException {
	
		if(valor > saldo) {
			throw new saldoInsuficienteException("Não há saldo suficiente para realizar o saque.");
		}
		else {
			saldo -= valor;
		}
		
		return "Saque efetuado com sucesso !";
	}
	
	//MÉTODOS GET'S
	
	public int getNumConta() {
		
		return numeroConta;
	}
	
	public String getNome() {
		return nomeTitular;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}
