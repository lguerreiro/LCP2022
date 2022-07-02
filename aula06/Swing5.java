package aula06;

import javax.swing.JFrame;

public class Swing5 {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		janela.setTitle("Janela JFrame");
		janela.setBounds(500, 400, 300, 300);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setVisible(true);
		
	}

}
