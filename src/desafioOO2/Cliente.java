package desafioOO2;

public class Cliente extends Pessoa {
	
	private int codigo;
	
	public Cliente(String nome, MinhaData nascimento, int codigo) {
		super(nome, nascimento);
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String imprimeCadastro() {
		return "Nome: " + this.getNome() + 
				"/n Nascimento: " + this.getNascimento() + 
				"/n Código: " + this.getCodigo();
	}
	
	@Override
	public String toString() {
		return 	"Nome: " + this.getNome() + 
				"\nNascimento: " + this.getNascimento() + 
				"\nCódigo: " + this.getCodigo();
	}

}
