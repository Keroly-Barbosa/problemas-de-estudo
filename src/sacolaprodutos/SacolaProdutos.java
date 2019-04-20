package sacolaprodutos;

import java.util.ArrayList;
import java.util.List;

public class SacolaProdutos {
	private String dono;
	private List<Produto> listaProdutos = new ArrayList<>();

	public void adcionaProduto(Produto produto) {
		listaProdutos.add(produto);
	}

	public void retornaLista() {
		System.out.println("a lista de produtos da sacola eh:");
		for (Produto produto : listaProdutos) {
			System.out.println(produto.getTipo());
		}
	}

}
