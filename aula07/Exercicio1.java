package aula07;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercicio1 extends JFrame{
	
	private final JButton botao;
	
	public Exercicio1() {
		super("Não clique");
		setSize(1000,1000);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		botao = new JButton();
		botao.setBounds(100, 100, 100, 100);
		botao.setText("Clique aqui!");
		panel.add(botao);
		
		botao.addMouseListener(new EsconderBotao());
		
		add(panel);
		 
	}
	
	private class EsconderBotao implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {	
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Random rand = new Random();
			int posx = rand.nextInt(900);
			int posy = rand.nextInt(900);
			botao.setBounds(posx, posy, 100, 100);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		
	}
	
	public static void main(String[] args) {
		Exercicio1 ex = new Exercicio1();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.setVisible(true);
	}

}
