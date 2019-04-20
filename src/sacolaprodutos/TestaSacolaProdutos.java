package sacolaprodutos;

public class TestaSacolaProdutos {
	public static void main(String[] args) {

		Produto salgadinho = new Produto();
		Produto refrigerante = new Produto();
		Produto chocolate = new Produto();

		salgadinho.setTipo("salgadinho");
		refrigerante.setTipo("refrigerante");
		chocolate.setTipo("chocolate");

		SacolaProdutos sacola = new SacolaProdutos();

		sacola.adcionaProduto(salgadinho);
		sacola.adcionaProduto(refrigerante);
		sacola.adcionaProduto(chocolate);

		sacola.retornaLista();

	}

}
