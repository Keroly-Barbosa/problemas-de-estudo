package timefutebol;

public class TestaEscalacao {

	public static void main(String[] args) {

		Time timeTop = new Time();

		Jogador joilson = new Jogador();
		Jogador romario = new Jogador();
		Jogador cleyson = new Jogador();

		joilson.setNome("Joilson");
		joilson.setScore(8);

		romario.setNome("Romario");
		romario.setScore(5);

		cleyson.setNome("Cleyson");
		cleyson.setScore(9);

		timeTop.escalar(joilson);
		timeTop.escalar(romario);
		timeTop.escalar(cleyson);

		timeTop.listaNomesJogadoresEscalados();

	}

}
