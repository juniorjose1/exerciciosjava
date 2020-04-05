package desafioOO1;

public abstract class Funcionario {

	private int numeroMatricula;
	private double salario;

	public Funcionario() {

	}

	public Funcionario(int numeroMatricula, double salario) {
		this.numeroMatricula = numeroMatricula;
		this.salario = salario;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract void calcularSalarioLiquido();

	public abstract String obterDados();

	@Override
	public String toString() {
		return "Funcionario [numeroMatricula=" + numeroMatricula + ", salario=" + salario + "]";
	}

}
