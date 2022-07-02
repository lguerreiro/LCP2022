package aula07;

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel 
{
   private int diameter = 10; // default diameter 

   // draw an oval of the specified diameter
   @Override
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.fillOval(10, 10, diameter, diameter); 
   }

   // validate and set diameter, then repaint 
   public void setDiameter(int newDiameter)
   {
      // if diameter invalid, default to 10
      diameter = (newDiameter >= 0 ? newDiameter : 10);
      repaint(); // repaint panel
   } 

   // used by layout manager to determine preferred size
   public Dimension getPreferredSize()
   {
      return new Dimension(200, 200);
   }

   // used by layout manager to determine minimum size
   public Dimension getMinimumSize()
   {
      return getPreferredSize();
   } 
} // end class OvalPanel