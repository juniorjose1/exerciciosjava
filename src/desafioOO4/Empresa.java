package desafioOO4;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	List<Funcionario> funcionarios = new ArrayList<>();
	
	public void cadastrarFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public double custoTotalEmpresa() {
		double custoTotal = 0;
		
		for(Funcionario funcionarioPercorrido: funcionarios) {
			if(funcionarioPercorrido instanceof FuncionarioSemEstudo) {
				custoTotal += ((FuncionarioSemEstudo) funcionarioPercorrido).getRendaSemEstudo();
			}if (funcionarioPercorrido instanceof FuncionarioEnsinoFundamental) {
				custoTotal += ((FuncionarioEnsinoFundamental) funcionarioPercorrido)
						.getRendaEnsinoFundamental();
			}if (funcionarioPercorrido instanceof FuncionarioEnsinoMedio) {
				custoTotal += ((FuncionarioEnsinoMedio) funcionarioPercorrido)
						.getRendaMedio();
			}if (funcionarioPercorrido instanceof FuncionarioGraduado) {
				custoTotal += ((FuncionarioGraduado) funcionarioPercorrido).getRendaGraduado();
			}
		}
		return custoTotal;
	}

}
