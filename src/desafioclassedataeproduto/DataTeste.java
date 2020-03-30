package desafioclassedataeproduto;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data1 = new Data();

		
		Data data2 = new Data(16, 05, 1995);
		
		
		System.out.println(data1.formatarData());
		
		System.out.println(data2.formatarData());
		
	}

}
