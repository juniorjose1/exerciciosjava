package desafioheranca;

public class Ferrari extends Carro {

	public Ferrari(double velocidadeAtual, double velocidadeMaxima) {
		super(velocidadeAtual, velocidadeMaxima);
	}

	@Override
	public void acelerar() {
		double velocidadeAtual = this.getVelocidadeAtual();
		double velocidadeMaxima = this.getVelocidadeMaxima();
		if (velocidadeAtual <= (velocidadeMaxima - 15)) {
			velocidadeAtual += 15;
			this.setVelocidadeAtual(velocidadeAtual);
		} else {
			this.setVelocidadeAtual(velocidadeMaxima);
		}

	}

	@Override
	public void frear() {
		double velocidadeAtual = this.getVelocidadeAtual();
		if (velocidadeAtual >= 15) {
			velocidadeAtual -= 15;
			this.setVelocidadeAtual(velocidadeAtual);
		} else {
			this.setVelocidadeAtual(0);
		}
	}

}
