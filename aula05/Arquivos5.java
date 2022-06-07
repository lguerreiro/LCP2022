package aula05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Arquivos5 {

	public static void main(String[] args) {
		
		String raiz = "D:\\Users\\Lucas\\";
		
		FileInputStream entrada;
		FileOutputStream saida;
		try {
			entrada = new FileInputStream(raiz + "entrada.txt");
			saida = new FileOutputStream(raiz + "saida2.txt");
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
