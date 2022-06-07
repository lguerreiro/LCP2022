package aula05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Arquivos0 {

	public static void main(String[] args) {
		
		String raiz = "D://Users//Lucas//";
		
		try {
			Scanner arquivo = new Scanner(new FileReader(raiz + "arquivo.txt", StandardCharsets.UTF_8));
			while (arquivo.hasNextLine()) {
			    String linha = arquivo.nextLine();
			    System.out.println(linha);
			}
			arquivo.close();
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não existe. Erro " + e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			String texto = Files.readString(Path.of(raiz + "arquivo.txt"));
			System.out.println(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			List<String> texto = Files.readAllLines(Path.of(raiz + "arquivo.txt"));
			System.out.println(texto);
			for (String linha : texto) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream inputStream = new FileInputStream(raiz + "arquivo.txt");
			byte[] texto_bytes = inputStream.readAllBytes();
			String texto = new String(texto_bytes, StandardCharsets.UTF_8);
			System.out.println(texto);
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}

}
