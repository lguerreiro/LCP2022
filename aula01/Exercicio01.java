package java01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", produto);
		float valor = scan.nextFloat();
		scan.close();
		System.out.printf("Produto %s custa %f .", produto, valor);

	}

}
