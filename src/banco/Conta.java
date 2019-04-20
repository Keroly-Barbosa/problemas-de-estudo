package banco;

public abstract class Conta implements AcoesConta {
	private int numero;
	private String agencia;
	private double saldo;

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double deposita(double valor) {
		if (valor > 0) {
			this.saldo = this.saldo + valor;
		} else {
			System.out.println("Você não pode depositar valor negastivo ou igual a zero!");
		}

		return saldo;
	}

	public double saca(double valor) {
		if (this.saldo > valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Voce nao pode sacar um valor maior que o seu saldo! ");
		}
		return saldo;
	}

}