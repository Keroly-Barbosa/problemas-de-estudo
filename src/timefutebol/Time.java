package timefutebol;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private List<Jogador> jogadoresEscalados = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void escalar(Jogador jogador) {
		if (jogador != null) {
			if (jogador.getScore() > 7) {
				jogadoresEscalados.add(jogador);
				System.out.println("O jogador " + jogador.getNome() + " foi escalado!");
			} else {
				System.out.println("O jogador " + jogador.getNome() + " não foi escalado!");
			}
		}
	}

	public void listaNomesJogadoresEscalados() {
		System.out.println("\nJogadores Escalados:");
		for (Jogador jogador : jogadoresEscalados) {
			System.out.println(jogador.getNome());
		}
	}

}
