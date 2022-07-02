package aula06;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Swing0 {

	public static void main(String[] args) {
			
		String nome;
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		JOptionPane.showMessageDialog(null, "Olá, " + nome);
		scan.close();

	}

}
