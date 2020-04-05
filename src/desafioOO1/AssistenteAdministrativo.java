package desafioOO1;

public class AssistenteAdministrativo extends Assistente {

	private boolean noturno;

	public AssistenteAdministrativo(int numeroMatricula, double salario, boolean noturno) {
		super(numeroMatricula, salario);
		this.noturno = noturno;
	}

	public boolean isNoturno() {
		return noturno;
	}

	public void setNoturno(boolean noturno) {
		this.noturno = noturno;
	}

	@Override
	public void calcularSalarioLiquido() {
		double salarioCalculado;
		if (this.noturno == true) {
			salarioCalculado = (this.getSalario() * 0.2 + this.getSalario());
			setSalario(salarioCalculado);
		} else {
			setSalario(this.getSalario());
		}

	}

	public String obterDados() {
		return "AssistenteAdministrativo [noturno=" + noturno + ", NúmeroMatricula=" + getNumeroMatricula()
				+ ", Salario=" + getSalario() + "]";
	}

}
