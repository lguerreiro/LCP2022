package aula07;

import javax.swing.JFrame;

public class TestaMenu{
   public static void main(String[] args){ 
      MenuFrame menuFrame = new MenuFrame(); 
      menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      menuFrame.setSize(500, 200); 
      menuFrame.setVisible(true);
   } 
} 