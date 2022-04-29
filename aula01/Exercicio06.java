package java01;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String produto;
		float valor;
		for (int i = 0; i < 5; i++){
			System.out.print("Digite o nome do produto: ");
			produto = scan.nextLine();
			System.out.printf("Digite o valor de compra do produto %s: ", produto);
			valor = scan.nextFloat();
			scan.nextLine();
			System.out.printf("%s cadastrado com valor %f", produto, valor);	
			System.out.println();
		}
		scan.close();

	}

}
