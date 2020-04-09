package desafioOO3;

public abstract class Produto {
	
	private int id;
	private String descricao;
	private double preco;
	private String dataVencimento;
	
	public Produto(int id) {
		this.id = id;
	}
	
	public Produto() {
		
	}

	public Produto(int id, String descricao, double preco, String dataVencimento) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
		this.dataVencimento = dataVencimento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	public String converterPraDecimal(double numero) {
		return String.format("%.2f", numero);
	}
	
	public abstract String calcularLucro();

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + ", dataVencimento="
				+ dataVencimento + "]";
	}
	
	
	

}
