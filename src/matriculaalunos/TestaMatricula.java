package matriculaalunos;

public class TestaMatricula {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();

		endereco.setNomeRua("rua Primeiro de Abril");
		endereco.setNumeroCasa(123);

		Matricula primeiraMatricula = new Matricula();

		Aluno joao = new Aluno();
		joao.setNome("Joao");
		joao.setEndere�o(endereco);

		primeiraMatricula.matricular(joao);
		System.out.println("Endere�o:");
		System.out.println(joao.getEndere�o());
		System.out.println();

		Matricula segundaMatricula = new Matricula();
		Aluno carlos = new Aluno();
		carlos.setNome("Carlos");
		carlos.setEndere�o(endereco);
		segundaMatricula.matricular(carlos);
		
		Matricula matricula = new Matricula();
		Aluno alberto = new Aluno();
		alberto.setNome("Alberto");
		alberto.setEndere�o(endereco);
		matricula.matricular(alberto);
		
		Aluno raimundo = new Aluno();
		raimundo.setNome("Raimundo");
		raimundo.setEndere�o(endereco);
		matricula.matricular(raimundo);

	}

}
