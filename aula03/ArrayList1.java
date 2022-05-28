package aula03;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		System.out.println("tamanho da lista: " + numeros.size());
		System.out.println("valor posicao 1: " + numeros.get(1));
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("valor em " + i + " = " + numeros.get(i));
		}
		numeros.remove(1);
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println("valor em " + i + " = " + numeros.get(i));
		}


	}

}
