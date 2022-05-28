package aula03;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] vetor = new int[10];
		
		for (int i = 0; i < 10; i++) {
			vetor[i] = (i+1) * num;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		
		scan.close();


	}

}
