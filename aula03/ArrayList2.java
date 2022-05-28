package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> nomes_funcionarios = new ArrayList<String>();
		nomes_funcionarios.add("Paulo");
		nomes_funcionarios.add("José");
		nomes_funcionarios.add("Carlos");
		nomes_funcionarios.add("Alberto");
		System.out.println("Antes da ordenacao:");
		for (String nome : nomes_funcionarios) {
			System.out.println(nome);
		}
		Collections.sort(nomes_funcionarios);
		System.out.println("\nApós a ordenacao:");
		for (String nome : nomes_funcionarios) {
			System.out.println(nome);
		}
	}

}
