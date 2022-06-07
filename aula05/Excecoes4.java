package aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes4 {

	static int leNota(int i) {// throws IllegalArgumentException{
		Scanner scan = new Scanner(System.in);
		System.out.printf("%nDigite a %dª nota: ", i+1);
		int nota = scan.nextInt();// Integer.parseInt(scan.nextLine());
		scan.nextLine();
		if (nota < 0 || nota > 10) {
			throw new IllegalArgumentException("Nota deve ser entre 0 e 10.%n");
		}
		return nota;
	}
	
	public static void main(String[] args){
			
		int[] notas = {-1, -1, -1};
			
		for (int i = 0; i < notas.length; i++) {
			while (notas[i] == -1) {
				
				try {
					notas[i] = leNota(i);
				} catch (InputMismatchException e) {
					System.out.print("Atenção! Nota inválida! Deve ser um número inteiro. Erro = " + e + "\n");
				} catch (IllegalArgumentException e) {
					System.out.print("Atenção! Nota inválida! Deve ser um número inteiro entre 0 e 10. Erro = " + e + "\n");
				} finally {
					System.out.print("Nota lida.\n");
				}
			}	
			System.out.print("Fim de leitura da nota.");
		}
				
		for (int i = 0; i < notas.length; i++) {
				System.out.printf("%nNota %d: %d", i+1, notas[i]);
		}
				
	}


}
