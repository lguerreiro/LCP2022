package java01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", produto);
		float valor = scan.nextFloat();
		while (valor > 100){
			System.out.printf("Produto excede o valor limite de 100. Digite novo valor: ");
			valor = scan.nextFloat();
		}
		System.out.printf("Produto %s cadastrado com valor %f .", produto, valor);
		scan.close();

	}

}
