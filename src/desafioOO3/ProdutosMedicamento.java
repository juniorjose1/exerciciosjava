package desafioOO3;


public class ProdutosMedicamento extends Produto {
	
	private double percentualLucro;
	
	public ProdutosMedicamento() {
		
	}
	
	public ProdutosMedicamento(int id) {
		super(id);
	}
	
	public ProdutosMedicamento(int id, String descricao, double preco, String dataVencimento, double percentualLucro) {
		super(id, descricao, preco, dataVencimento);
		this.percentualLucro = percentualLucro;
	}

	public double getPercentualLucro() {
		return percentualLucro;
	}

	public void setPercentualLucro(double percentualLucro) {
		this.percentualLucro = percentualLucro;
	}
	
	@Override
	public String calcularLucro() {
		double lucro;
		lucro = this.getPercentualLucro() * this.getPreco();
		return converterPraDecimal(lucro);
	}
	
	@Override
	public String toString() {
		return  "MEDICAMENTO" +
				"\nProduto ID: " + getId() +
				"\nDescrição: " + getDescricao() +
				"\nPreço: " + getPreco() +
				"\nData de Vencimento: " + getDataVencimento() +
				"\nLucro: " + calcularLucro() +
				"\n---------------------------------------------" +
				"\n";
	}
	

}
