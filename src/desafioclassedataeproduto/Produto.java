package desafioclassedataeproduto;

public class Produto {
	
	String nome;
	double preco;
	static double descontoInicial = 0.25;
	double precoFinal;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double calcularPrecoDoProdutoComDesconto() {
		precoFinal = this.preco - (this.preco * descontoInicial);
		return precoFinal;
	}
	
	public double calcularPrecoDoProdutoComDesconto(double descontoMaior) {
		precoFinal = this.preco - (this.preco * descontoInicial) - (this.preco * (descontoMaior / 100));
		return precoFinal;
	}

}
