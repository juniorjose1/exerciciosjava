package desafioconversao;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String salario1;
		String salario2;
		String salario3;
		double resultado;
		
		System.out.print("Digite seu primeiro salário: ");
		salario1 = entrada.next();
		salario1 = salario1.replace(",", ".");
		
		System.out.print("Digite seu segundo salário: ");
		salario2 = entrada.next();
		salario2 = salario2.replace(",", ".");
		
		System.out.print("Digite seu terceiro salário: ");
		salario3 = entrada.next();
		salario3 = salario3.replace(",", ".");
		
		double salario1Convertido = Double.parseDouble(salario1);
		double salario2Convertido = Double.parseDouble(salario2);
		double salario3Convertido = Double.parseDouble(salario3);
		
		resultado = (salario1Convertido + salario2Convertido + salario3Convertido) / 3;
		
		System.out.printf("O Resultado final é: %.2f", resultado);
		
		entrada.close();
		
	}

}
