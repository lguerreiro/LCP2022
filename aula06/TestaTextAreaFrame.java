package aula06;

import javax.swing.JFrame;

public class TestaTextAreaFrame {

	public static void main(String[] args) {
		TextAreaFrame textAreaFrame = new TextAreaFrame();
		textAreaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textAreaFrame.setSize(425,200);
		textAreaFrame.setVisible(true);
	}

}
