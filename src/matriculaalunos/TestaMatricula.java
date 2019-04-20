package matriculaalunos;

public class TestaMatricula {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();

		endereco.setNomeRua("rua Primeiro de Abril");
		endereco.setNumeroCasa(123);

		Matricula primeiraMatricula = new Matricula();

		Aluno joao = new Aluno();
		joao.setNome("Joao");
		joao.setEndereço(endereco);

		primeiraMatricula.matricular(joao);
		System.out.println("Endereço:");
		System.out.println(joao.getEndereço());
		System.out.println();

		Matricula segundaMatricula = new Matricula();
		Aluno carlos = new Aluno();
		carlos.setNome("Carlos");
		carlos.setEndereço(endereco);
		segundaMatricula.matricular(carlos);
		
		Matricula matricula = new Matricula();
		Aluno alberto = new Aluno();
		alberto.setNome("Alberto");
		alberto.setEndereço(endereco);
		matricula.matricular(alberto);
		
		Aluno raimundo = new Aluno();
		raimundo.setNome("Raimundo");
		raimundo.setEndereço(endereco);
		matricula.matricular(raimundo);

	}

}
