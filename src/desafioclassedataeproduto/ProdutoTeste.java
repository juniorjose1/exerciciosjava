package desafioclassedataeproduto;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Sucrilhos", 10);
		
		System.out.println(produto1.calcularPrecoDoProdutoComDesconto(10));
		
	}

}
