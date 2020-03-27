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
		}else if(diaSemana.equalsIgnoreCase("Terça") || diaSemana.equalsIgnoreCase("Terca")){
			numeroDoDia = 3;
		}else if(diaSemana.equalsIgnoreCase("Quarta")) {
			numeroDoDia = 4;
		}else if(diaSemana.equalsIgnoreCase("Quinta")) {
			numeroDoDia = 5;
		}else if(diaSemana.equalsIgnoreCase("Sexta")) {
			numeroDoDia = 6;
		}else if(diaSemana.equalsIgnoreCase("Sábado") || diaSemana.equalsIgnoreCase("Sabado")) {
			numeroDoDia = 7;
		}else {
			System.out.println("Dia da Semana Inválido !");
		}
		
		System.out.println("O número desse dia da semana é: " + numeroDoDia);
		
		entrada.close();
	}

}
