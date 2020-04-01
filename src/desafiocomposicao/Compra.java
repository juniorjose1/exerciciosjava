package desafiocomposicao;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> listaDeItens = new ArrayList<>();
	private double totalListaItens = 0;
	
	public void adicionarItem(Item item) {
		listaDeItens.add(item);
		totalListaItens += (item.getQtdItem() * item.getProduto().getPreco());
	}
	
	public double totalItem() {
		return totalListaItens;
	}
}
