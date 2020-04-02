package desafioheranca;

public abstract class Carro {
	
	private double velocidadeAtual;
	private final double VELOCIDADE_MAXIMA;
	
	public Carro(double velocidadeAtual, double velocidadeMaxima) {
		this.velocidadeAtual = velocidadeAtual;
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public double getVelocidadeMaxima() {
		return VELOCIDADE_MAXIMA;
	}
	
	public abstract void acelerar();
	
	public abstract void frear();
	
	
	
}
