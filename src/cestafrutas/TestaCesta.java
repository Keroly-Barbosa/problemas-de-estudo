package cestafrutas;

public class TestaCesta {

	public static void main(String[] args) {

		Fruta limao = new Fruta();
		Fruta laranja = new Fruta();
		Fruta acerola = new Fruta();

		limao.setNome("limao");
		laranja.setNome("laranja");
		acerola.setNome("acerola");

		CestaFrutas cestaFrutas = new CestaFrutas();

		cestaFrutas.adcionaFruta(limao);
		cestaFrutas.adcionaFruta(laranja);
		cestaFrutas.adcionaFruta(acerola);

		cestaFrutas.removeFruta(limao);

		Fruta fruta = cestaFrutas.procuraFrutaPorNome(laranja);
		if (fruta != null) {
			System.out.println("Achou: " + fruta.getNome());
		}

		fruta = cestaFrutas.procuraFrutaPorNome("acerola");
		if (fruta != null) {
			System.out.println("Achou: " + fruta.getNome());
		}

	}

}
