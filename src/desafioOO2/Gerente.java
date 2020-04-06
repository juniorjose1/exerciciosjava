package desafioOO2;

public class Gerente extends Funcionario implements Tributo {

	private String area;
	
	public Gerente(String nome, MinhaData nascimento, float salario, String area) {
		super(nome, nascimento, salario);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	@Override
	public String imprimeCadastro() {
		return "Nome: " + this.getNome() + 
				"/n Nascimento: " + this.getNascimento() + 
				"/n Sal·rio: " + this.getSalario()
				+ "/n ¡rea: " + this.getArea();
	}

	@Override
	public void calculaImposto() {
		float salarioCalculado;
		salarioCalculado = (this.getSalario() - this.getSalario() * 0.05F);
		setSalario(salarioCalculado);
	}
	
	@Override
	public String toString() {
		this.calculaImposto();
		return "Nome: " + this.getNome() + 
				"\nNascimento: " + this.getNascimento() + 
				"\nSal·rio: " + this.getSalario()
				+ "\n¡rea: " + this.getArea();
	}

}
