package java01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		float valor;
		do {
			System.out.printf("Digite o valor de compra do produto (< 100) %s: ", produto);
			valor = scan.nextFloat();
		} while (valor > 100);
		System.out.printf("Produto %s cadastrado com valor %f.", produto, valor);
		scan.close();

	}

}
