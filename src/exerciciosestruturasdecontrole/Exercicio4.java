package exerciciosestruturasdecontrole;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double numero;
		int contador = 0;
		
		System.out.print("Digite um n�mero para verificar se � primo ou n�o: ");
		numero = entrada.nextDouble();
		
		for(int x = 1; x <= numero; x++) {
			if(numero % x == 0) {
				contador++;
			}
		}
		
		if(contador == 2) {
			System.out.println("N�mero Primo !");
		}else {
			System.out.println("N�mero n�o � Primo !");
		}
		
		entrada.close();
		
	}

}
