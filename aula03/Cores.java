package aula03;

import java.util.*;

public class Cores {
	
	public static void exibeCores(Collection<String> imprimirLista, String texto) {
		System.out.print("imprimindo " + texto + ": ");
		for (String c : imprimirLista) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public static void removerCores(Collection<String> col1, Collection<String> col2) {
		Iterator<String> iterator = col1.iterator();
		
		while (iterator.hasNext()) {
			if (col2.contains(iterator.next())){
				iterator.remove();
			}
		}
	}

	public static void main(String[] args) {
		String[] cores = {"AZUL", "VERMELHO", "VERDE", "AMARELO", "CINZA", "PRETO", "BRANCO"};
		List<String> lista = new ArrayList<String>();
		
		for (String cor: cores) {
			lista.add(cor);
		}
		
		String[] coresRemover = {"BRANCO", "VERDE"};
		List<String> listaRemover = new ArrayList<String>();
		
		for (String cor: coresRemover) {
			listaRemover.add(cor);
		}
		
		exibeCores(lista, "lista inicial");
		exibeCores(listaRemover, "lista de cores a remover");	
		removerCores(lista, listaRemover);
		exibeCores(lista, "lista final");
	}

}
