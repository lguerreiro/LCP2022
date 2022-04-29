package java01;

import java.util.Scanner;

public class Exercicio07b {
	
	String nome;
	float valor;

	void setNomeProduto(String nome){
		this.nome = nome;
	}
	
	void setValor(float valor){
		this.valor = valor;
	}
	float getValorFinal(){
		return (float) (this.valor * 1.15);
	}

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String nome_produto = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", nome_produto);
		float valor = scan.nextFloat();
		Exercicio07b produto = new Exercicio07b();
		produto.setNomeProduto(nome_produto);
		produto.setValor(valor);
		float valor_final = produto.getValorFinal();
		System.out.printf("Valor final é de %f.", valor_final);
		scan.close();
	}


}
