package matriculaalunos;

public class Endereco {
	private String nomeRua;
	private int numeroCasa;

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public int getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	@Override
	public String toString() {
		return nomeRua;
	}

}
