package matriculaalunos;

public class Matricula {
	private Aluno aluno;
	public static int numeroMatricula = 100000;

	public void matricular(Aluno aluno) {
		this.aluno = aluno;
		System.out.println(
				"Aluno " + aluno.getNome() + " foi matriculado. \nNúmero de Matricula: " + Matricula.numeroMatricula);
		Matricula.numeroMatricula = Matricula.numeroMatricula + 1;
		System.out.println("-----------------------");
	}

	public int getNumeroMatricla() {
		return Matricula.numeroMatricula;
	}

}
