package desafioOO3;

import java.text.DecimalFormat;

public class ProdutosHigiene extends Produto {
	
	private final static double PERCENTUAL_LUCRO = 0.3;
	
	DecimalFormat df = new DecimalFormat("0,00");
	
	public ProdutosHigiene() {
		
	}
	
	public ProdutosHigiene(int id) {
		super(id);
	}
	
	public ProdutosHigiene(int id, String descricao, double preco, String dataVencimento) {
		super(id, descricao, preco, dataVencimento);
	}
	
	@Override
	public String calcularLucro() {
		double lucro;
		lucro = this.getPreco() * PERCENTUAL_LUCRO;
		return converterPraDecimal(lucro);
	}

	@Override
	public String toString() {
		return  "PRODUTO DE HIGIENE" +
				"\nProduto ID: " + getId() +
				"\nDescrição: " + getDescricao() +
				"\nPreço: " + getPreco() +
				"\nData de Vencimento: " + getDataVencimento() +
				"\nLucro: " + calcularLucro() +
				"\n---------------------------------------------" +
				"\n";
	}
}
