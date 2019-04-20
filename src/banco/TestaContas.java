package banco;

public class TestaContas {

	public static void main(String[] args) {

		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaCorrente contaCorrente = new ContaCorrente();

		Cliente cliente = new Cliente();
		cliente.setContaCorrente(contaCorrente);
		cliente.setContaPoupanca(contaPoupanca);

		cliente.getContaCorrente().deposita(500.0);
		contaCorrente.saca(400);

		contaPoupanca.deposita(350.0);
		contaPoupanca.saca(49.0);

		System.out.println("Saldo da Poupança é: " + contaPoupanca.getSaldo());
		System.out.println("Saldo da Conta Corrente é: " + contaCorrente.getSaldo());

	}

}
