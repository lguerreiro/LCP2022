package aula07;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.ButtonGroup;

public class PopupFrame extends JFrame{
  
	private final JRadioButtonMenuItem[] items; 
   private final Color[] colorValues = {Color.BLUE, Color.YELLOW, Color.RED};
   private final JPopupMenu popupMenu;

   public PopupFrame(){
      super("Usando JPopupMenus");

      ItemHandler handler = new ItemHandler(); 
      String[] colors = {"Azul", "Amarelo", "Vermelho"};

      ButtonGroup colorGroup = new ButtonGroup(); 
      popupMenu = new JPopupMenu(); 
      items = new JRadioButtonMenuItem[colors.length];

      for (int count = 0; count < items.length; count++) {
         items[count] = new JRadioButtonMenuItem(colors[count]);
         popupMenu.add(items[count]); 
         colorGroup.add(items[count]); 
         items[count].addActionListener(handler); 
      }

      setBackground(Color.WHITE); 

      addMouseListener(
         new MouseAdapter(){  
            @Override
            public void mousePressed(MouseEvent event){ 
               checkForTriggerEvent(event); 
            } 

            @Override
            public void mouseReleased(MouseEvent event){ 
               checkForTriggerEvent(event);
            }

            private void checkForTriggerEvent(MouseEvent event){
               if (event.isPopupTrigger()) 
                  popupMenu.show(event.getComponent(), event.getX(), event.getY());  
            }
         } 
      ); 
   } 

   private class ItemHandler implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent event){
         for (int i = 0; i < items.length; i++){
            if (event.getSource() == items[i]) {
               getContentPane().setBackground(colorValues[i]);
               return;
            } 
         } 
      } 
   } 
}