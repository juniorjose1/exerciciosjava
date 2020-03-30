package desafiomoduloclassemetodo;

public class Jantar {

	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Bolo", 0.5);
		
		Comida comida2 = new Comida("Salgadinho", 1.2);
		
		Comida comida3 = new Comida("Salgadinho", 1.2);
		
		Pessoa pessoa1 = new Pessoa("Alexandre", 80);
		
		System.out.println(comida2.equals(comida3));
		
		pessoa1.Comer(comida1);
		
		System.out.println("O peso de " + pessoa1.getNome() + " é de " + pessoa1.verificarPeso() + "kg");
		
		pessoa1.Comer(comida2);
		
		System.out.printf("O Peso de %s é de %.2fkg", pessoa1.getNome(), pessoa1.verificarPeso());
	}

}
