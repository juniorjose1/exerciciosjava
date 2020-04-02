package desafioheranca;

public class Civic extends Carro {

	public Civic(double velocidadeAtual, double velocidadeMaxima) {
		super(velocidadeAtual, velocidadeMaxima);
	}

	@Override
	public void acelerar() {
		double velocidadeAtual = this.getVelocidadeAtual();
		double velocidadeMaxima = this.getVelocidadeMaxima();
		if (velocidadeAtual <= (velocidadeMaxima - 5)) {
			velocidadeAtual += 5;
			this.setVelocidadeAtual(velocidadeAtual);
		}else {
			this.setVelocidadeAtual(velocidadeMaxima);
		}
	}

	@Override
	public void frear() {
		double velocidadeAtual = this.getVelocidadeAtual();
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
			this.setVelocidadeAtual(velocidadeAtual);
		} else {
			this.setVelocidadeAtual(0);
		}
	}

}
