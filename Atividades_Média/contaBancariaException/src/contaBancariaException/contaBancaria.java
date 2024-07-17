package contaBancariaException;

public class contaBancaria {

	int numConta;
	double saldo;

	public contaBancaria(int numConta, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String depositar(double valor) {
		if (valor < 0) {
			return "Depósito inválido.";
		} else {
			saldo += valor;
			return "Depósito realizado com sucesso !";
		}
	}

	public String sacar (double valor) throws saldoInsuficienteException {
		if (saldo >= valor) {
			saldo -= valor;
			return "Saque de R$" + valor + " realizado com sucesso.\nSaldo atual R$: " + saldo();
		} else {
			throw new saldoInsuficienteException("Saldo insuficiente.");
		}
	}

	public double saldo() {
		return saldo;
	}
}
