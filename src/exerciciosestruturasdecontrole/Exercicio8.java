package exerciciosestruturasdecontrole;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String palavra;
		
		System.out.print("Digite uma palavra: ");
		palavra = entrada.next();
		
		for(int x = 0; x < palavra.length(); x++) {
			System.out.println(palavra.charAt(x));
		}
		
		entrada.close();
		
	}

}
