package aula06;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class Exercicio2 extends JFrame{
	
	private final JLabel label1 = new JLabel();
	private final JLabel label2 = new JLabel();
	
	private final JButton trocar = new JButton("Trocar");
	
	public Exercicio2(){
		super("Troca texto");
		setLayout(new FlowLayout());
		
		label1.setText("Label 1");
		add(label1);
		
		label2.setText("Label 2");
		add(label2);
		
		add(trocar);
		
		BotaoHandler handler = new BotaoHandler();
		trocar.addActionListener(handler);
		
		setVisible(true);
	}
	
	private class BotaoHandler implements ActionListener {
    
		@Override
		public void actionPerformed(ActionEvent event) {
			String texto1, texto2;
            if (event.getSource() == trocar) {
            	texto1 = new String(label1.getText());
            	texto2 = new String(label2.getText());
            	label1.setText(texto2);
            	label2.setText(texto1);
            }
		}
	}
	
	public static void main(String[] args) {
		Exercicio2 ex1 = new Exercicio2(); 
		ex1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ex1.setSize(150, 100); 
		ex1.setVisible(true);
	}
}