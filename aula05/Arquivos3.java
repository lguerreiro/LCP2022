package aula05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivos3 {

	public static void main(String[] args) {
		
		String raiz = "D://Users//Lucas//";
		Scanner arquivo = null;
		
		try {
			arquivo = new Scanner(new File(raiz + "dados2.txt"));
			
			int contador = 0;
			while (arquivo.hasNext()) {
				contador++;
				String linha = arquivo.nextLine();
								
				Scanner dadosLinha = new Scanner(linha).useDelimiter("\\s/\\s");
				
				String nome = dadosLinha.next();
				String curso = dadosLinha.next();
				int idade = dadosLinha.nextInt();
				System.out.printf("Aluno %d. Nome: %s, curso: %s, idade: %d%n", contador, nome, curso, idade);
			
			}
		}catch (FileNotFoundException e) {
			System.err.println("Erro: arquivo não encontrado. Encerrando...");
			System.exit(1);
		} finally {
			arquivo.close();
		}

	}

}
