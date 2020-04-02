package desafioheranca;

public class CarroTeste {

	public static void main(String[] args) {

		Carro carro1 = new Civic(97, 100);
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();


		System.out.println("A Velocidade Atual do Carro é de: " + carro1.getVelocidadeAtual());

		Carro carro2 = new Ferrari(90, 100);

		carro2.acelerar();
		carro2.acelerar();

		System.out.println("A Velocidade Atual do Carro é de: " + carro2.getVelocidadeAtual());

	}

}
