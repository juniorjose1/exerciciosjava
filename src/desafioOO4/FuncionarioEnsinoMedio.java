package desafioOO4;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoFundamental {

	private String nomeEscolaMedio;
	private double rendaMedio;
	private FuncionarioEnsinoFundamental rendaEnsinoFundamental = new FuncionarioEnsinoFundamental();

	public FuncionarioEnsinoMedio() {

	}

	public FuncionarioEnsinoMedio(Integer id, String nome, String nomeEscolaBasica, String nomeEscolaMedio) {
		super(id, nome, nomeEscolaBasica);
		this.nomeEscolaMedio = nomeEscolaMedio;
	}

	public String getNomeEscolaMedio() {
		return nomeEscolaMedio;
	}

	public void setNomeEscolaMedio(String nomeEscolaMedio) {
		this.nomeEscolaMedio = nomeEscolaMedio;
	}

	public double getRendaMedio() {
		calcularRendaTotal();
		return rendaMedio;
	}

	public void setRendaMedio(double rendaMedio) {
		this.rendaMedio = rendaMedio;
	}

	@Override
	public void calcularRendaTotal() {
		double rendaCalculada;
		double rendaFundamental = rendaEnsinoFundamental.getRendaEnsinoFundamental();
		rendaCalculada = rendaFundamental * 0.5 + rendaFundamental;
		setRendaMedio(rendaCalculada);
	}

}
