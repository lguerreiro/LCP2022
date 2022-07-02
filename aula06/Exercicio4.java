package aula06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Exercicio4 extends JFrame{
	
	private final JTextField textNumero;
	private final JButton botao;
	private final int numero;
	
	public Exercicio4() {
		super("Adivinha Número");
		setLayout(new FlowLayout());
		textNumero = new JTextField(15);
		
		Random rand = new Random();
		numero = rand.nextInt(100);
		
		botao = new JButton("Dar palpite");
		botao.addActionListener(new BotaoHandler());
		
		add(textNumero);
		add(botao);
	}
	
	private class BotaoHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			int palpite = Integer.parseInt(textNumero.getText());
			if (palpite == numero) {
				JOptionPane.showMessageDialog(null, "Você acertou!");
				System.exit(1);
			} else if (palpite > numero) {
				JOptionPane.showMessageDialog(null, "O número é menor do que " + palpite, "Errou", JOptionPane.ERROR_MESSAGE);
			} else if (palpite < numero) {
				JOptionPane.showMessageDialog(null, "O número é maior do que " + palpite, "Errou", JOptionPane.ERROR_MESSAGE);
			}
			textNumero.requestFocus();
		}
		
	}

}
