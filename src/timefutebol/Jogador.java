package timefutebol;

public class Jogador {
	private int score;
	private String nome;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Jogador [score=" + score + ", nome=" + nome + "]";
	}

}
