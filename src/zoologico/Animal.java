package zoologico;

public abstract class Animal implements EmitidorDeSom {
	private String nome;
	private String som;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", som=" + som + "]";
	}
	
	
	

}
