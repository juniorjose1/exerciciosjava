package desafiofundamentos;

import java.util.Scanner;

public class DesafioFundamentos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double n1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("Digite + para somar, \n"
				         + "Digite * para multiplicar, \n"
						 + "Digite / para dividir, \n"
						 + "Digite - para subtrair, \n"
						 + "Digite % para saber o m�dulo de ambos.");
		String operador = entrada.next();
		
		System.out.println("A Resposta da Opera��o �: ");
		
		System.out.println(operador.equals("+") ? n1 + n2:
						   operador.equals("-") ? n1 - n2:
						   operador.equals("*") ? n1 * n2:
						   operador.equals("/") ? n1 / n2:
						   operador.equals("%") ? n1 % n2:"Opera��o Incorreta, digite um operador v�lido !" );
		
		entrada.close();
		
		
	}

}
