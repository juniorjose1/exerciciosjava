package desafioOO2;

public class Principal {
	
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Maria", new MinhaData(5, 3, 1954), 2);
		
		Funcionario funcionario1 = new Funcionario("Alexandre", new MinhaData(16, 5, 1995), 2500);
		
		Funcionario funcionario2 = new Gerente("Vitor", new MinhaData(8, 1, 2000), 4000, "Financeiro");
		
		CadastroPessoas cadastro1 = new CadastroPessoas();
		
		cadastro1.cadastrar(cliente1);
		cadastro1.cadastrar(funcionario1);
		cadastro1.cadastrar(funcionario2);
		
		System.out.println(cadastro1.imprimeCadastro());
		
	}

}
