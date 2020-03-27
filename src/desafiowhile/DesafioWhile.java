package desafiowhile;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double totalNota = 0;
		double quantidadeNota = 0;
		double mediaDasNotas;
		
		while(nota != -1) {
			System.out.print("Digite uma nota de 0 a 10 ou -1 para finalizar e calcular a média: ");
			nota = entrada.nextDouble();
			if(nota <= 10 && nota >= 0) {
				totalNota += nota;
				quantidadeNota++;
			}else if(nota != -1) {
				System.out.println("Nota inválida !");
			}
		}
		
		mediaDasNotas = totalNota / quantidadeNota;
		
		System.out.printf("A Média das Notas é %.2f", mediaDasNotas);
		
		entrada.close();
		
	}

}
