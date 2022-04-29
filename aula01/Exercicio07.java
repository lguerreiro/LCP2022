package java01;

import java.util.Scanner;

public class Exercicio07 {
	
	static float calculaPreco(float valor_bruto){
		return (float) (valor_bruto*1.15);
	}


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", produto);
		float valor = scan.nextFloat();
		float valor_final = calculaPreco(valor);
		System.out.printf("Valor final é de %f.", valor_final);
		scan.close();

	}

}
