package aula06;

import javax.swing.JOptionPane;

public class Swing2 {

	public static void main(String[] args) {
			
		String nome, nota_string;
		int nota1, nota2;
		nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		nota_string =  JOptionPane.showInputDialog(String.format("Digite a primeira nota do aluno %s: ", nome));
		nota1 = Integer.parseInt(nota_string);
		nota_string =  JOptionPane.showInputDialog(String.format("Digite a segunda nota do aluno %s: ", nome));
		nota2 = Integer.parseInt(nota_string);
		float media = (float) (nota1+nota2) / 2;
		JOptionPane.showMessageDialog(null, String.format("A média do aluno %s foi %.2f", nome, media));

	}

}
