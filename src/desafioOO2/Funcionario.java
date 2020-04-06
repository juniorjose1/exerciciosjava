package desafioOO2;

public class Funcionario extends Pessoa implements Tributo {
	
	private float salario;
	
	public Funcionario(String nome, MinhaData nascimento, float salario) {
		super(nome, nascimento);
		this.salario = salario;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String imprimeCadastro() {
		return "Nome: " + this.getNome() + 
				"/n Nascimento: " + this.getNascimento() + 
				"/n Salário: " + this.getSalario();
	}

	@Override
	public void calculaImposto() {
		float salarioCalculado;
		salarioCalculado = (this.getSalario() - this.getSalario() * 0.03F);
		setSalario(salarioCalculado);
	}
	
	@Override
	public String toString() {
		this.calculaImposto();
		return "Nome: " + this.getNome() + 
				"\nNascimento: " + this.getNascimento() + 
				"\nSalário: " + this.getSalario();
	}

	

}
