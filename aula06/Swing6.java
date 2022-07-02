package aula06;

import javax.swing.JFrame;

public class Swing6 extends JFrame {
	
	public Swing6() {
		super("Janela JFrame");
		setBounds(500, 400, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Swing6();
	}

}
