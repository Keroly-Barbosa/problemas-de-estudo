package matriculaalunos;

public class TestaMatricula {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();

		endereco.setNomeRua("rua Primeiro de Abril");
		endereco.setNumeroCasa(123);

		Matricula primeiraMatricula = new Matricula();

		Aluno joao = new Aluno();
		joao.setNome("Joao");
		joao.setEnderešo(endereco);

		primeiraMatricula.matricular(joao);
		System.out.println("Enderešo:");
		System.out.println(joao.getEnderešo());
		System.out.println();

		Matricula segundaMatricula = new Matricula();
		Aluno carlos = new Aluno();
		carlos.setNome("Carlos");
		carlos.setEnderešo(endereco);
		segundaMatricula.matricular(carlos);
		
		Matricula matricula = new Matricula();
		Aluno alberto = new Aluno();
		alberto.setNome("Alberto");
		alberto.setEnderešo(endereco);
		matricula.matricular(alberto);
		
		Aluno raimundo = new Aluno();
		raimundo.setNome("Raimundo");
		raimundo.setEnderešo(endereco);
		matricula.matricular(raimundo);

	}

}
