package desafiocomposicao;

import java.util.ArrayList;

public class Cliente {
	
	private String nome;
	ArrayList<Compra> listaDeCompras = new ArrayList<>();
	private double totalCompra = 0;
	
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void realizarCompra(Compra compra) {
		listaDeCompras.add(compra);
		totalCompra += compra.totalItem();
	}
	
	public double calcularValorTotalCompra() {
		return totalCompra;
	}
	

}
