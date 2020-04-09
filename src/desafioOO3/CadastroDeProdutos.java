package desafioOO3;

import java.util.ArrayList;

public class CadastroDeProdutos {
	
	ArrayList<Produto> produtosCadastrados = new ArrayList<>();
	
	public String cadastrarProduto(Produto produto) {
		if(!produtosCadastrados.contains(new ProdutosHigiene(produto.getId())) && 
				!produtosCadastrados.contains(new ProdutosMedicamento(produto.getId()))) {
			produtosCadastrados.add(produto);
			return "Produto Cadastrado com Sucesso !";
		}
		return "Cadastro não efetuado, pois já se encontra um "
				+ "produto com o mesmo ID em nosso estoque";
	}
	
	public String mostrarProdutos() {
		String listaProdutos = "";
		for(Produto produtoPercorrido: produtosCadastrados) {
			listaProdutos += produtoPercorrido;
		}
		return listaProdutos;
	}
	
	public Produto mostrarProdutoPorId(int id) {
		int idCorreto = id - 1;
		Produto produtoEncontrado = produtosCadastrados.get(idCorreto);
		return produtoEncontrado;
	}
	
	
}
