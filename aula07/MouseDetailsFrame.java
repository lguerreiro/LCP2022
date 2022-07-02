package aula07;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame{
	
	private String details; 
	private final JLabel statusBar; 
	
	public MouseDetailsFrame(){
		super("Cliques do mouse com adaptadores");
		statusBar = new JLabel("Clique com o mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new MouseClickHandler()); 
	}
	
	private class MouseClickHandler extends MouseAdapter{
		@Override
      	public void mouseClicked(MouseEvent event){
			int xPos = event.getX();          			
			int yPos = event.getY();
			details = String.format("%d clique(s)", event.getClickCount());
			if (event.isMetaDown()) details += " com botão direito";
			else if (event.isAltDown()) details += " com botão do meio";
            else details += " com botão esquerdo";
            statusBar.setText(details);
		}
	}
}	

