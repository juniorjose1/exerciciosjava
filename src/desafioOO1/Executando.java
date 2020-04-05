package desafioOO1;

public class Executando {

	public static void main(String[] args) {
		
		Funcionario func1 = new AssistenteTecnico(1, 1000);
		
		func1.calcularSalarioLiquido();
		
		System.out.println(func1.obterDados());
		
		Funcionario func2 = new AssistenteAdministrativo(2, 1000, true);
		
		func2.calcularSalarioLiquido();
		
		System.out.println(func2.obterDados());
		
	}

}
