package desafiofor;

public class DesafioFor {

	public static void main(String[] args) {
		
		String caractere = "#";
		
		for(String x = "#"; !x.equals("#####"); x.concat("#")) {
			System.out.println(x);
			x += caractere;
		}
		
	}

}
