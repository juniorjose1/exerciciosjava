package desafiopolimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Alexandre", 80);
		
		Comida arroz = new Arroz(5);
		
		Comida feijao = new Feijao(2);
		
		Comida Sorvete = new Sorvete(10);
		
		pessoa1.comer(arroz);
		
		pessoa1.comer(feijao);
		
		pessoa1.comer(Sorvete);
		
		System.out.println(pessoa1);
		
	}

}
