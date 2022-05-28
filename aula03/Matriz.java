package aula03;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		String[][] matriz = new String[num][num];
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < i + 1 ; j++) {
				matriz[i][j] = "*";
			}
		}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (matriz[i][j] != null) {
					System.out.print(matriz[i][j]);
				}
			}
			System.out.println();
		}

	}

}
