package desafioifdiadasemana;

import java.util.Scanner;

public class DesafioIfDiaDaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String diaSemana = entrada.next();
		
		int numeroDoDia = 0;
		
		if(diaSemana.equalsIgnoreCase("Domingo")) {
			numeroDoDia = 1;
		}else if(diaSemana.equalsIgnoreCase("Segunda")) {
			numeroDoDia = 2;
		}else if(diaSemana.equalsIgnoreCase("Ter�a") || diaSemana.equalsIgnoreCase("Terca")){
			numeroDoDia = 3;
		}else if(diaSemana.equalsIgnoreCase("Quarta")) {
			numeroDoDia = 4;
		}else if(diaSemana.equalsIgnoreCase("Quinta")) {
			numeroDoDia = 5;
		}else if(diaSemana.equalsIgnoreCase("Sexta")) {
			numeroDoDia = 6;
		}else if(diaSemana.equalsIgnoreCase("S�bado") || diaSemana.equalsIgnoreCase("Sabado")) {
			numeroDoDia = 7;
		}else {
			System.out.println("Dia da Semana Inv�lido !");
		}
		
		System.out.println("O n�mero desse dia da semana �: " + numeroDoDia);
		
		entrada.close();
	}

}
