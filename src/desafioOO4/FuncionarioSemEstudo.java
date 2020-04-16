package desafioOO4;

public class FuncionarioSemEstudo extends Funcionario {

	private double rendaSemEstudo;
	
	public FuncionarioSemEstudo() {
		this.rendaSemEstudo = 1000;
	}

	public FuncionarioSemEstudo(int id, String nome) {
		super(id, nome);
		this.rendaSemEstudo = 1000;
	}

	public double getRendaSemEstudo() {
		return rendaSemEstudo;
	}
	
	
}
