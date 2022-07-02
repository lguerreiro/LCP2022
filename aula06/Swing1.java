package aula06;

import javax.swing.JOptionPane;

public class Swing1 {

	public static void main(String[] args) {
			
		String nome;
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showMessageDialog(null, "Olá, " + nome);

	}

}
