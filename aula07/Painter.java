package aula07;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Painter{
	
	public static void main(String[] args){ 
		JFrame application = new JFrame("Paint");

		PaintPanel paintPanel = new PaintPanel(); 
		application.add(paintPanel, BorderLayout.CENTER); 
      
		application.add(new JLabel("Clique e arraste o mouse para desenhar"), 
         BorderLayout.SOUTH);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setSize(400, 200); 
		application.setVisible(true); 
   } 
}