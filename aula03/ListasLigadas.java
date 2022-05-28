package aula03;
import java.util.*;

public class ListasLigadas {
	
	private static void exibeLista(List<String> lista, String texto){
		System.out.printf("imprimindo " + texto + ": ");
		
		for (String cor : lista)
		   System.out.printf("%s ", cor);
		System.out.println();
	}
	
	private static void converteCaixaAlta(List<String> lista) {
		ListIterator<String> iterator = lista.listIterator();
		while (iterator.hasNext()){
			String cor = iterator.next(); 
			iterator.set(cor.toUpperCase()); 
		}

	}
	
	private static void removerCores(List<String> lista, int inicio, int fim){
		lista.subList(inicio, fim).clear();
	}
		
	private static void exibeListaInvertida(List<String> lista){
		ListIterator<String> iterator = lista.listIterator(lista.size());
		System.out.printf("Lista Invertida: ");
		while (iterator.hasPrevious())
			System.out.printf("%s ", iterator.previous());
	}

	public static void main(String[] args) {
		
		String[] colors = {"azul", "vermelho", "verde", "amarelo", "cinza", "preto", "branco"};
		List<String> lista1 = new LinkedList<>();
		for (String cor : colors)
			lista1.add(cor);
		
		String[] cores2 = {"marrom", "laranja", "roxo", "rosa"};
		List<String> lista2 = new LinkedList<>();
		
		for (String cor : cores2)
			lista2.add(cor);

		lista1.addAll(lista2); 
		
		lista2 = null; 
		exibeLista(lista1, "lista inicial"); 
		
		converteCaixaAlta(lista1);
		exibeLista(lista1, "lista em caixa alta"); 
		
		System.out.printf("%nRemovendo elementos de 4 a 6...%n");
		removerCores(lista1, 4, 7);
		exibeLista(lista1, "lista com elementos removidos"); 
		exibeListaInvertida(lista1);
	}

	
		
} 


