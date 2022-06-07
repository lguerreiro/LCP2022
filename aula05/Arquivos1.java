package aula05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Arquivos1 {

	public static void main(String[] args) {
		
		String raiz = "D://Users//Lucas//";
		
		Scanner arquivo = null;
		
		try {
			arquivo = new Scanner(new FileReader(raiz + "arquivo.txt", StandardCharsets.UTF_8));
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não existe. Erro " + e);
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			while (arquivo.hasNextLine()) {
			    String linha = arquivo.nextLine();
			    System.out.println(linha);
			}
			arquivo.close();
		}
	
	}

}
