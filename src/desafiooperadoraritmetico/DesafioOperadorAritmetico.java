package desafiooperadoraritmetico;

public class DesafioOperadorAritmetico {

	public static void main(String[] args) {
		
		double dividendoSuperiorEsquerdo = Math.pow((6 * (3 + 2)), 2);
		double dividendoInferiorEsquerdo = 3 * 2;
		double resultadoDividendoEsquerdo = dividendoSuperiorEsquerdo / dividendoInferiorEsquerdo;
		
		double dividendoSuperiorDireito = (1 - 5) * (2 - 7);
		double dividendoInferiorDireito = 2;
		double resultadoDividendoDireito = Math.pow((dividendoSuperiorDireito / dividendoInferiorDireito), 2);
		
		double resultadoDividendoPrincipal = Math.pow(resultadoDividendoEsquerdo - resultadoDividendoDireito, 3);
		
		double divisor = Math.pow(10, 3);
		
		double resultadoPrincipal = resultadoDividendoPrincipal / divisor;
		
		System.out.printf("O Resultado da equação é: %.2f", resultadoPrincipal);
		
	}

}
