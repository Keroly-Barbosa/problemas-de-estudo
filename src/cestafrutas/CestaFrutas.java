package cestafrutas;

import java.util.ArrayList;
import java.util.List;

public class CestaFrutas {
	List<Fruta> frutas;

	public CestaFrutas() {
		frutas = new ArrayList<>();
	}

	public void adcionaFruta(Fruta fruta) {
		frutas.add(fruta);
		listaNomeFrutas();
	}

	public void removeFruta(Fruta fruta) {
		frutas.remove(fruta);
		listaNomeFrutas();
	}

	public void listaNomeFrutas() {
		for (Fruta fruta : frutas) {
			System.out.println(fruta.getNome());
		}
		System.out.println("-------------------");
	}

	public Fruta procuraFrutaPorNome(String nomeFruta) {
		for (Fruta fruta : frutas) {
			if (fruta.getNome().equals(nomeFruta)) {
				return fruta;
			}
		}
		return null;
	}

	public Fruta procuraFrutaPorNome(Fruta fruta) {
		int indice = frutas.indexOf(fruta);
		if (indice > -1) {
			return frutas.get(indice);
		}
		return null;
	}

	public List<Fruta> getFrutas() {
		return frutas;
	}
}
