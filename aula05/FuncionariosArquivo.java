package aula05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionariosArquivo {
	
	private String nome;
	private String cargo;
	private double salario;
	
	public FuncionariosArquivo(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return String.format("Funcionário: %s, cargo: %s, salário: %.2f", nome, cargo, salario);
	}

	public static void main(String[] args) {
		
		List<FuncionariosArquivo> funcionarios = new ArrayList<>();
		
		String raiz = "D://Users//Lucas//";
		Scanner arquivo = null;
		
		try {
			arquivo = new Scanner(new File(raiz + "dados3.txt"));
			
			int contador = 0;
			while (arquivo.hasNext()) {
				contador++;
				String linha = arquivo.nextLine();
								
				Scanner dadosLinha = new Scanner(linha).useDelimiter("\\s/\\s");
								
				String nome = dadosLinha.next();
				String cargo = dadosLinha.next();
				double salario = Double.parseDouble(dadosLinha.next()) ;
				
				funcionarios.add(new FuncionariosArquivo(nome, cargo, salario));
			
			}
		}catch (FileNotFoundException e) {
			System.err.println("Erro: arquivo não encontrado. Encerrando...");
			System.exit(1);
		} finally {
			arquivo.close();
			
			System.out.println("---------- FUNCIONARIOS ------------");
			
			for (FuncionariosArquivo funcionario : funcionarios) {
				System.out.println(funcionario);
			}
		}
		
	}

}
