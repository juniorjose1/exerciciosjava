package desafiotemperatura;

import java.util.Scanner;

public class Temperatura {
	
	final static int CONSTANTE = 32;
	int numero;

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double temperaturaFarenheit;
		double temperaturaConvertida;
		
		System.out.print("Digite a temperatura em Farenheit que mostraremos em Celcius: ");
		temperaturaFarenheit = teclado.nextDouble();
		
		temperaturaConvertida = (temperaturaFarenheit - CONSTANTE) * 5 / 9; //convertendo a temperatura
		
		System.out.printf("A temperatura em Celcius é de %.2f°C", temperaturaConvertida);
		
		teclado.close();
	}

}
