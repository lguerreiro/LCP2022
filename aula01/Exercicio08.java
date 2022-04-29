package java01;

import java.util.Scanner;

public class Exercicio08 {
	
	private String nome;
	private String categoria;
	private float valor;
	private double preco;


	void cadastrarProduto(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String produto = scan.nextLine();
		System.out.printf("Digite a categoria do produto %s: ", produto);
		String categoria = scan.nextLine();
		System.out.printf("Digite o valor de compra do produto %s: ", produto);
		float valor = scan.nextFloat();
		this.nome = produto;
		this.categoria = categoria;
		this.valor = valor;
		scan.close();
	}
	
	void definirPreco(){
		if (this.valor < 100)
			this.preco = this.valor * 1.15;
		else if (this.valor < 200)
			this.preco = this.valor * 1.12;
		else
			this.preco = this.valor * 1.1;
	}
	
	String getNome(){
		return this.nome;
	}
	
	float getPreco(){
		return (float) this.preco;
	}
	
	public static void main(String[] args){
		Exercicio08 produto = new Exercicio08();
		produto.cadastrarProduto();
		produto.definirPreco();
		System.out.printf("Preço final do produto %s deve ser %.2f", produto.getNome(), produto.getPreco());
	}


}
