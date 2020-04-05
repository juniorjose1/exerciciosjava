package desafioOO1;

public class AssistenteTecnico extends Assistente {

	public AssistenteTecnico(int numeroMatricula, double salario) {
		super(numeroMatricula, salario);
	}

	@Override
	public void calcularSalarioLiquido() {
		double salarioCalculado;
		salarioCalculado = (this.getSalario() * 0.1 + this.getSalario());
		setSalario(salarioCalculado);
	}

	@Override
	public String obterDados() {
		return "Assistente Técnico = [Salário = " + this.getSalario() + ", NúmeroMatricula = "
				+ this.getNumeroMatricula();
	}

}
