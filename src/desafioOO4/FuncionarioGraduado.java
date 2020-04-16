package desafioOO4;

public class FuncionarioGraduado extends FuncionarioEnsinoMedio {

	private String nomeUniversidade;
	private double rendaGraduado;
	private FuncionarioEnsinoMedio rendaEnsinoMedio = new FuncionarioEnsinoMedio();


	public FuncionarioGraduado() {

	}

	public FuncionarioGraduado(Integer id, String nome, String nomeEscolaBasica, String nomeEscolaMedio,
			String nomeUniversidade) {
		super(id, nome, nomeEscolaBasica, nomeEscolaMedio);
		this.nomeUniversidade = nomeUniversidade;
	}

	public String getNomeUniversidade() {
		return nomeUniversidade;
	}

	public void setNomeUniversidade(String nomeUniversidade) {
		this.nomeUniversidade = nomeUniversidade;
	}

	public double getRendaGraduado() {
		calcularRendaTotal();
		return rendaGraduado;
	}

	public void setRendaGraduado(double rendaGraduado) {
		this.rendaGraduado = rendaGraduado;
	}

	@Override
	public void calcularRendaTotal() {
		double rendaCalculada;
		double rendaMedio = rendaEnsinoMedio.getRendaMedio();
		rendaCalculada = rendaMedio + rendaMedio;
		setRendaGraduado(rendaCalculada);
	}

}
