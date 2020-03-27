package desafiooperadorlogico;

public class DesafioOperadorLogico {

	public static void main(String[] args) {
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = false;
		boolean comprarTV50 = trabalhoTerca && trabalhoQuinta;
		boolean comprarTV32 = trabalhoTerca ^ trabalhoQuinta;
		boolean protegidoCoronaVirus = !trabalhoTerca && !trabalhoQuinta;
		
		
		System.out.println("Vai comprar TV de 50 Polegadas? " + comprarTV50);
		
		System.out.println("Vai comprar TV de 32 Polegadas? " + comprarTV32);
		
		System.out.println("Vai ficar em casa protegido do Corona Virus? " + protegidoCoronaVirus);
		
	}

}
