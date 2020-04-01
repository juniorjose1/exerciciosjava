package desafiocomposicao;

public class Item {
	
	private int qtdItem;
	private Produto produto;
	
	public Item(int qtdItem, Produto produto) {
		super();
		this.qtdItem = qtdItem;
		this.produto = produto;
	}
	
	public int getQtdItem() {
		return qtdItem;
	}
	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	

}
