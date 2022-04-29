package java01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite a categoria do produto %s: ", produto);
		String categoria = scan.nextLine();
		switch (categoria){
			case "BEBIDA": System.out.printf("%s é de se beber ", produto); break;
			case "COMIDA": System.out.printf("%s é de se comer ", produto); break;
			default: System.out.printf("%s: sem ações de categoria.", produto);
		}
		scan.close();
	}

}
