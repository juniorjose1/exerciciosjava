package desafioOO4;

public class Principal {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new FuncionarioSemEstudo(1, "Vitinho");
		
		Funcionario funcionario2 = new FuncionarioEnsinoFundamental(2, "Tathi Crush", "Maria Aparecida");
		
		Funcionario funcionario3 = new FuncionarioEnsinoMedio(3, "Ana Clara", "Maria Aparecida", "Opção");
		
		Funcionario funcionario4 = new FuncionarioGraduado(4, "Rosana", "Jacyra", "Univap", "Unifei");
		
		Funcionario funcionario5 = new FuncionarioGraduado(4, "Rosana", "Jacyra", "Univap", "Unifei");

		
		Empresa empresa1 = new Empresa();
		
		empresa1.cadastrarFuncionarios(funcionario1);
		
		empresa1.cadastrarFuncionarios(funcionario2);
		
		empresa1.cadastrarFuncionarios(funcionario3);
		
		empresa1.cadastrarFuncionarios(funcionario4);
		
		empresa1.cadastrarFuncionarios(funcionario5);

		
		System.out.println(empresa1.custoTotalEmpresa());
		
	}

}
