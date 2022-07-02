package aula06;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercicio3 {
	
	private final static JCheckBox cbMarcador = new JCheckBox();
	private final static JButton btnContador = new JButton("Exibir Contagem");
	private static int contagem = 0;
	
	private static class Ex3Handler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cbMarcador) {
				contagem++;
			} else if (e.getSource() == btnContador) {
				JOptionPane.showMessageDialog(null, String.format("Marcador foi clicado %d vezes", contagem));
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Contador de cliques");
		frame.setLayout(new FlowLayout());
		frame.add(cbMarcador);
		frame.add(btnContador);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 100);
		Ex3Handler handler = new Ex3Handler();
		cbMarcador.addActionListener(handler);
		btnContador.addActionListener(handler);
		frame.setVisible(true);
	}

}
