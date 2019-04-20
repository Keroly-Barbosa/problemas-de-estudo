package banco;

public class ContaPoupanca extends Conta {

	@Override
	public double saca(double valor) {
		double taxa = 1.0;
		if (this.getSaldo() >= (valor + taxa)) {
			double saldo = this.getSaldo() - (valor + taxa);
			this.setSaldo(saldo);
		} else {
			System.out.println("Voce nao pode sacar um valor maior que o seu saldo! ");
		}
		return this.getSaldo();
	}
}
