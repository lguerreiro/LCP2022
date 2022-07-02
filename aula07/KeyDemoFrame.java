package aula07;

import java.awt.Color;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
   private String line1 = ""; 
   private String line2 = ""; 
   private String line3 = ""; 
   private JTextArea textArea; 


   public KeyDemoFrame(){
      super("Demonstrating Keystroke Events");

      textArea = new JTextArea(10, 15);
      textArea.setText("Pressione qualquer tecla...");
      textArea.setEnabled(false);
      textArea.setDisabledTextColor(Color.BLACK);
      add(textArea); 

      addKeyListener(this);
   } 

   @Override
   public void keyPressed(KeyEvent event){
      line1 = String.format("Tecla pressionada: %s", 
        KeyEvent.getKeyText(event.getKeyCode())); 
      setLines2and3(event); 
   }

   @Override
   public void keyReleased(KeyEvent event){
      line1 = String.format("Tecla solta: %s",
         KeyEvent.getKeyText(event.getKeyCode())); 
      setLines2and3(event);
   }

   @Override
   public void keyTyped(KeyEvent event){
      line1 = String.format("Tecla digitada: %s", event.getKeyChar());
      setLines2and3(event); 
   }

   private void setLines2and3(KeyEvent event){
      line2 = String.format("Tecla de ação: %s", 
         (event.isActionKey() ? "SIM" : "NÃO"));

      String temp = KeyEvent.getModifiersExText(event.getModifiersEx());

      line3 = String.format("Tecla especial pressionada: %s", 
         (temp.equals("") ? "nenhuma" : temp)); 

      textArea.setText(String.format("%s\n%s\n%s\n", 
         line1, line2, line3)); 
   }
} 