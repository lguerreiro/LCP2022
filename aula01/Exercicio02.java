package java01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", produto);
		float valor = scan.nextFloat();
		if (valor > 100)
			System.out.printf("Produto %s custa %f , excedendo em %f o limite de 100.", produto, valor, valor - 100);
		else
		System.out.printf("Produto %s custa %f.", produto, valor);
		scan.close();


	}

}
