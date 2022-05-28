package aula03;

import java.util.Scanner;

public class FuncionariosArray{
	
	private String nome;
	private double salario;

	public FuncionariosArray(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionário: " + nome + " recebe R$" + salario;
	}
	
	public static void main(String[] args) {
		FuncionariosArray[] funcionarios = new FuncionariosArray[5];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < funcionarios.length; i++) {
			
			System.out.print("Digite o nome do funcionário: ");
			String nome = scan.nextLine();
			
			System.out.printf("Digite o salário do funcionário %s: ", nome);
			double salario = scan.nextDouble();
			
			funcionarios[i] = new FuncionariosArray(nome, salario);
			scan.nextLine();
		}
		
		scan.close();
		
		for (FuncionariosArray func : funcionarios) {
			System.out.println(func);
		}
	}
}

