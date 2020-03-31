package exercicioscollections;

import java.util.Scanner;

public class DesafioMatriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem na sala? ");
		int quantidadeAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas vão ser digitadas? ");
		int quantidadeNotas = entrada.nextInt();
		
		double alunosENotas[][] = new double[quantidadeAlunos][quantidadeNotas];
		
		for(int x = 0; x < quantidadeAlunos; x++) {
			System.out.printf("Aluno %d, ", (x + 1));
			for(int y = 0; y < quantidadeNotas; y++) {
				System.out.printf("digite a %d° nota: ", (y + 1));
				alunosENotas[x][y] = entrada.nextDouble();
			}
		}
		
		double somaNotas = 0;
		int qtdAlunos = 0;
		
		for(double percorreAlunos[]: alunosENotas) {
			for(double percorreNota: percorreAlunos) {
				qtdAlunos++;
				somaNotas += percorreNota;
			}
		}
		
		double media = somaNotas / qtdAlunos;
		
		System.out.printf("A Média da sala é de %.2f", media);
		
		entrada.close();
		
	}

}
