package desafioarray;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Quantas notas vão ser digitadas? ");
		int quantidadeNotas = entrada.nextInt();
		
		double notas[] = new double[quantidadeNotas];
		
		for(int x = 0; x < notas.length; x++) {
			System.out.print("Digite a " + (x + 1) + "° nota: ");
			notas[x] = entrada.nextDouble();
		}
		
		double somaTotal = 0;
		
		for(double somaPercorrida: notas) {
			somaTotal += somaPercorrida;
		}
		
		double media = somaTotal / quantidadeNotas;
		
		System.out.printf("A Média das notas é de %.2f", media);
		
		entrada.close();
		
		
	}

}
