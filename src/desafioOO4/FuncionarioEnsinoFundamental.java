package desafioOO4;

public class FuncionarioEnsinoFundamental extends Funcionario {

	private String nomeEscolaBasica;
	private double rendaEnsinoFundamental;
	private FuncionarioSemEstudo rendaFuncionarioSemEstudo = new FuncionarioSemEstudo();

	public FuncionarioEnsinoFundamental() {
		
	}

	public FuncionarioEnsinoFundamental(Integer id, String nome, String nomeEscolaBasica) {
		super(id, nome);
		this.nomeEscolaBasica = nomeEscolaBasica;
	}

	public String getNomeEscolaBasica() {
		return nomeEscolaBasica;
	}

	public void setNomeEscolaBasica(String nomeEscolaBasica) {
		this.nomeEscolaBasica = nomeEscolaBasica;
	}

	public double getRendaEnsinoFundamental() {
		calcularRendaTotal();
		return rendaEnsinoFundamental;
	}

	public void setRendaEnsinoFundamental(double rendaEnsinoFundamental) {
		this.rendaEnsinoFundamental = rendaEnsinoFundamental;
	}

	public void calcularRendaTotal() {
		double rendaCalculada;
		double rendaSemEstudo = rendaFuncionarioSemEstudo.getRendaSemEstudo();
		rendaCalculada = rendaSemEstudo * 0.1 + rendaSemEstudo;
		setRendaEnsinoFundamental(rendaCalculada);
	}

}
