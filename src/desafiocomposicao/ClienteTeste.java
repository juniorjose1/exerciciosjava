package desafiocomposicao;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Arroz", 2);
		Produto produto2 = new Produto("Feijão", 3);
		Produto produto3 = new Produto("Macarrão", 5);
		
		Item item1 = new Item(3, produto1);
		Item item2 = new Item(3, produto2);
		Item item3 = new Item(2, produto3);
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem(item1);
		compra1.adicionarItem(item2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(item3);
		
		Cliente cliente1 = new Cliente("Alexandre");
		
		cliente1.realizarCompra(compra1);
		cliente1.realizarCompra(compra2);
		
		System.out.println(cliente1.calcularValorTotalCompra());
		
		Cliente cliente2 = new Cliente("Vitor");
		
		cliente2.realizarCompra(compra2);
		
		System.out.println(cliente2.calcularValorTotalCompra());
		
	}

}
