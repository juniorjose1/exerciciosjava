package desafioOO2;

public abstract class Pessoa {

	private String nome;
	private MinhaData nascimento;
	
	public Pessoa(String nome, MinhaData nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public MinhaData getNascimento() {
		return nascimento;
	}

	public void setNascimento(MinhaData nascimento) {
		this.nascimento = nascimento;
	}

	public abstract String imprimeCadastro();
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\n"
				+ "Data de Nascimento: " + this.getNascimento();
	}

}
