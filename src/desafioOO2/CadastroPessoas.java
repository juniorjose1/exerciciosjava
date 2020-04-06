package desafioOO2;

import java.util.ArrayList;

public class CadastroPessoas {
	
	ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
	
	private int quantidade;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void cadastrar(Pessoa pessoa) {
		listaDePessoas.add(pessoa);
	}
	
	public String imprimeCadastro() {
		String pessoas = "";
		for(Pessoa pessoa: listaDePessoas) {
			pessoas += pessoa + "\n--------------------\n";
		}
		return pessoas;
	}

}
