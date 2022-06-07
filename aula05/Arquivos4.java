package aula05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos4 {

	public static void main(String[] args) {
		
		String raiz = "D:\\Users\\Lucas\\";
		
		FileReader entrada;
		FileWriter saida;
		try {
			entrada = new FileReader(raiz + "entrada.txt");
			saida = new FileWriter(raiz + "saida.txt");
			int c;
			while ((c = entrada.read()) != -1) {
				saida.write(c);
			}
			entrada.close();
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			System.out.println("Cópia terminada.");
		}
		
	}

}
