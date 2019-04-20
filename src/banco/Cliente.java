package banco;

public class Cliente {

	private String nome;
	private Conta contaCorrente = new ContaCorrente();
	private Conta contaPoupanca = new ContaPoupanca();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(Conta contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public Conta getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(Conta contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

}
