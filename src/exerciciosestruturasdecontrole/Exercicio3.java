package exerciciosestruturasdecontrole;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		
		System.out.print("Digite a 1° Nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.print("Digite a 2° Nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado !");
		}else if(media < 7 && media > 4) {
			System.out.println("Em Recuperação !");
		}else {
			System.out.println("Reprovado !");
		}
		
		entrada.close();
		
	}

}
