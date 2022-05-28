package aula03;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> notas = new HashMap<>();
		notas.put("Paulo", 5);
		notas.put("José", 8);
		notas.put("Carlos", 7);
		
		for (String n : notas.keySet()) {
			System.out.print("A nota de " + n + " foi " + notas.get(n) + "\n");
		}
		
		if(notas.containsKey("Paulo")) {
			System.out.print(notas.get("Paulo"));
		};
		
	}

}
