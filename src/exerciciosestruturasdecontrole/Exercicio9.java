package exerciciosestruturasdecontrole;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero de 1 a 7 para verificar o dia da semana: ");
		numero = entrada.nextInt();
		
		switch(numero){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Ter�a");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("S�bado");
				break;
			default:
				System.out.println("Nenhum dia encontrado !");
		}
		
		entrada.close();
		
		
		
	}

}
