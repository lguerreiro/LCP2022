package aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] notas = {-1, -1, -1};
		
		for (int i = 0; i < notas.length; i++) {
			while (notas[i] == -1) {
				System.out.printf("%nDigite a %dª nota: ", i+1);
				try {
					notas[i] = Integer.parseInt(scan.nextLine());
				} catch (InputMismatchException e) {
					System.out.print("Atenção! Nota inválida!");
				} catch (NumberFormatException e) {
					System.out.print("Atenção! Nota inválida!");
				}
			}	
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("%nNota %d: %d", i+1, notas[i]);
		}
		
		scan.close();
		
	}

}
