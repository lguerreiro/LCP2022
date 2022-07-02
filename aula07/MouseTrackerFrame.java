package aula07;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame{
	
	private final JPanel mousePanel; 
	private final JLabel statusBar; 
	
	public MouseTrackerFrame(){
		super("Analisando uso de Eventos do Mouse");
		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE); 
		add(mousePanel, BorderLayout.CENTER); 
		statusBar = new JLabel("Mouse fora do JPanel"); 
		add(statusBar, BorderLayout.SOUTH); 
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}
	
	private class MouseHandler implements MouseListener, MouseMotionListener{
		
		@Override
		public void mouseClicked(MouseEvent event){
				statusBar.setText(String.format("Clique em [%d, %d]", event.getX(), event.getY()));
		}

		@Override
		public void mousePressed(MouseEvent event) {
			statusBar.setText(String.format("Pressionado  em [%d, %d]", event.getX(), event.getY()));
		}
		@Override
		public void mouseReleased(MouseEvent event){
			statusBar.setText(String.format("Solto em [%d, %d]", event.getX(),event.getY()));
		}
		@Override
		public void mouseEntered(MouseEvent event){
			statusBar.setText(String.format("Mouse entrou em [%d, %d]", event.getX(),event.getY()));
			mousePanel.setBackground(Color.GREEN);
		}
		@Override
		public void mouseExited(MouseEvent event){
			statusBar.setText("Mouse fora do JPanel");
			mousePanel.setBackground(Color.WHITE);
		} 	

		@Override
		public void mouseDragged(MouseEvent event){
			statusBar.setText(String.format("Arrastando em [%d, %d]", event.getX(),event.getY()));
		}

		@Override
		public void mouseMoved(MouseEvent event){
			statusBar.setText(String.format("Movendo em [%d, %d]", event.getX(),event.getY()));
		}
	} 

}
