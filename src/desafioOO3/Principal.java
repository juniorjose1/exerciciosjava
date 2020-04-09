package desafioOO3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Produto produto1 = new ProdutosHigiene(1, "Para pessoas com corona", 200, "10/10/2020");
		
		Produto produto2 = new ProdutosMedicamento(1, "Para pessoas com Asma", 500, "10/10/2020", 0.2);
		
		CadastroDeProdutos cadastro = new CadastroDeProdutos();
		
		int a = 0;
		int id = 0;
		do {
		System.out.println("Menu: "
				+ "\nDigite 1 para Cadastrar um produto de Higine"
				+ "\nDigite 2 para Cadastrar um Medicamento"
				+ "\nDigite 3 para Visualizar todos os Produtos Cadastrados"
				+ "\nDigite 4 para Procurar Um Produto por ID"
				+ "\nDigite 5 para sair");
		int menu = entrada.nextInt();
		
		switch(menu) {
			case 1:
				id++;
				System.out.println("Cadastrando um Produto de Higiene:");
				System.out.print("Digite uma descrição: ");
				String descricaoHigiene = entrada.next();
				System.out.print("Digite o Preço: ");
				double precoHigiene = entrada.nextDouble();
				System.out.print("Digite a Data de Validade: ");
				String dataHigiene = entrada.next();
				System.out.println(cadastro.cadastrarProduto(new ProdutosHigiene(id, descricaoHigiene, precoHigiene, dataHigiene)));
				break;
			case 2:
				id++;
				System.out.println("Cadastrando um Medicamento: ");
				System.out.print("Digite uma descrição: ");
				String descricaoMedicamento = entrada.next();
				System.out.print("Digite o Preço: ");
				double precoMedicamento = entrada.nextDouble();
				System.out.print("Digite a Data de Validade: ");
				String dataMedicamento = entrada.next();
				System.out.print("Digite a Porcentagem de Lucro: ");
				double porcentagemLucro = entrada.nextDouble();
				System.out.println(cadastro.cadastrarProduto(new ProdutosMedicamento(id, descricaoMedicamento, precoMedicamento, dataMedicamento, porcentagemLucro)));
				break;
			case 3:
				System.out.println(cadastro.mostrarProdutos());
				break;
			case 4:
				System.out.print("Digite o ID do Produto que deseja Consultar: ");
				int idProduto = entrada.nextInt();
				System.out.println(cadastro.mostrarProdutoPorId(idProduto));
				break;
			case 5:
				a = entrada.nextInt();
		}
		}while(a == 0);
		

		
		
	}

}
