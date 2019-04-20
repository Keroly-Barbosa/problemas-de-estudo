package zoologico;

public class TestaSons {

	public static void main(String[] args) {

		Vaca vaca = new Vaca();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		Zoologico zoo1 = new Zoologico();

		zoo1.consultaSomAnimal(vaca);
		zoo1.consultaSomAnimal(cachorro);
		zoo1.consultaSomAnimal(gato);

	}

}
