package aula05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Arquivos2 {

	public static void main(String[] args) {
		
		String raiz = "D://Users//Lucas//";
		Scanner arquivo = null;
		
		try {
			arquivo = new Scanner(new File(raiz + "dados.txt"));
		}catch (FileNotFoundException e) {
			System.err.println("Erro: arquivo não encontrado. Encerrando...");
			System.exit(1);
		} finally {
			int contador = 0;
			while (arquivo.hasNext()) {
				contador++;
				String linha = arquivo.nextLine();
				String[] nome = linha.split(" ");
				String primeiroNome = nome[0];
				String sobrenome = nome[1];
				System.out.printf("Pessoa %d. Nome: %s, sobrenome: %s%n", contador, primeiroNome, sobrenome);
			}
		}

	}

}
