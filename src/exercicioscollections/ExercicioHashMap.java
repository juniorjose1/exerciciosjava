package exercicioscollections;

import java.util.HashMap;
import java.util.Map.Entry;

public class ExercicioHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> listaDeUsuarios = new HashMap<>();
		
		listaDeUsuarios.put(0, "Alexandre");
		listaDeUsuarios.put(1, "Vitor");
		listaDeUsuarios.put(2, "Tathi");
		listaDeUsuarios.put(3, "Madeleine");
		
		System.out.println(listaDeUsuarios);
		
		System.out.println(listaDeUsuarios.keySet());
		
		System.out.println(listaDeUsuarios.values());
		
		for(int chavePercorrida: listaDeUsuarios.keySet()) {
			System.out.print(chavePercorrida + " ");
		}
		
		System.out.println();
		
		for(String valorPercorrido: listaDeUsuarios.values()) {
			System.out.print(valorPercorrido + " ");
		}
		
		System.out.println();
		
		for(Entry<Integer, String> mapaPercorrido: listaDeUsuarios.entrySet()) {
			System.out.println(mapaPercorrido.getKey() + " >>> " + mapaPercorrido.getValue());
		}
		
		
		
		
		
	}

}
