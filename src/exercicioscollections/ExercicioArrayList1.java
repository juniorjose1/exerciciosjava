package exercicioscollections;

import java.util.ArrayList;

public class ExercicioArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> listaDeCores = new ArrayList<>();
		
		listaDeCores.add("Amarelo");
		listaDeCores.add("Azul");
		listaDeCores.add("Verde");
		listaDeCores.add("Vermelho");
		
		System.out.println(listaDeCores);
		
		for(String coresPercorridas: listaDeCores) {
			System.out.println(coresPercorridas);
		}
		
		listaDeCores.add(0, "Laranja");
		
		System.out.println(listaDeCores);
		
		listaDeCores.remove(3);
		
		System.out.println(listaDeCores);
		
		
	}

}
