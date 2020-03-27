package desafiofundamentos;

import java.util.Scanner;

public class DesafioFundamentos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Digite + para somar, \n"
				         + "Digite * para multiplicar, \n"
						 + "Digite / para dividir, \n"
						 + "Digite - para subtrair, \n"
						 + "Digite % para saber o módulo de ambos.");
		String operador = entrada.next();
		
		System.out.println("A Resposta da Operação é: ");
		
		System.out.println(operador.equals("+") ? n1 + n2:
						   operador.equals("-") ? n1 - n2:
						   operador.equals("*") ? n1 * n2:
						   operador.equals("/") ? n1 / n2:
						   operador.equals("%") ? n1 % n2:"Operação Incorreta, digite um operador válido !" );
		
		entrada.close();
		
		
	}

}
