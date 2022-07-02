package aula07;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class MenuFrame extends JFrame {
   private final Color[] colorValues = {Color.BLACK, Color.BLUE, Color.RED, Color.GREEN};   
   private final JRadioButtonMenuItem[] colorItems; 
   private final JRadioButtonMenuItem[] fonts; 
   private final JCheckBoxMenuItem[] styleItems; 
   private final JLabel displayJLabel; 
   private final ButtonGroup fontButtonGroup; 
   private final ButtonGroup colorButtonGroup; 
   private int style;

   public MenuFrame(){
      super("Usando JMenus");     

      JMenu fileMenu = new JMenu("Arquivo");
      fileMenu.setMnemonic('A');

      JMenuItem aboutItem = new JMenuItem("Sobre...");
      aboutItem.setMnemonic('S'); 
      fileMenu.add(aboutItem); 
      aboutItem.addActionListener(
         new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent event){
               JOptionPane.showMessageDialog(MenuFrame.this,
                  "Este é um exemplo\ndo uso de menus.",
                  "Sobre", JOptionPane.PLAIN_MESSAGE);
            } 
         } 
      ); 
 
      JMenuItem exitItem = new JMenuItem("Sair"); 
      exitItem.setMnemonic('i'); 
      fileMenu.add(exitItem); 
      exitItem.addActionListener(
         new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0); 
            } 
         }
      ); 

      JMenuBar bar = new JMenuBar(); 
      setJMenuBar(bar); 
      bar.add(fileMenu); 

      JMenu formatMenu = new JMenu("Formatar"); 
      formatMenu.setMnemonic('r'); 

      String[] colors = {"Preto", "Azul", "Vermelho", "Verde"};

      JMenu colorMenu = new JMenu("Cor"); 
      colorMenu.setMnemonic('C'); 

      colorItems = new JRadioButtonMenuItem[colors.length];
      colorButtonGroup = new ButtonGroup(); // manages colors
      ItemHandler itemHandler = new ItemHandler(); // handler for colors

      // create color radio button menu items
      for (int count = 0; count < colors.length; count++){
         colorItems[count] = 
            new JRadioButtonMenuItem(colors[count]); // create item
         colorMenu.add(colorItems[count]); // add item to color menu
         colorButtonGroup.add(colorItems[count]); // add to group
         colorItems[count].addActionListener(itemHandler);
      }

      colorItems[0].setSelected(true); // select first Color item

      formatMenu.add(colorMenu); // add color menu to format menu
      formatMenu.addSeparator(); // add separator in menu

      // array listing font names
      String[] fontNames = {"Serif", "Monospaced", "SansSerif"};
      JMenu fontMenu = new JMenu("Fonte"); // create font menu
      fontMenu.setMnemonic('n'); // set mnemonic to n

      // create radio button menu items for font names
      fonts = new JRadioButtonMenuItem[fontNames.length];
      fontButtonGroup = new ButtonGroup(); // manages font names

      // create Font radio button menu items
      for (int count = 0; count < fonts.length; count++) {
         fonts[count] = new JRadioButtonMenuItem(fontNames[count]);
         fontMenu.add(fonts[count]); // add font to font menu
         fontButtonGroup.add(fonts[count]); // add to button group
         fonts[count].addActionListener(itemHandler); // add handler
      } 

      fonts[0].setSelected(true); // select first Font menu item
      fontMenu.addSeparator(); // add separator bar to font menu

      String[] styleNames = {"Negrito", "Itálico"}; // names of styles
      styleItems = new JCheckBoxMenuItem[styleNames.length];
      StyleHandler styleHandler = new StyleHandler(); // style handler

      // create style checkbox menu items
      for (int count = 0; count < styleNames.length; count++){
         styleItems[count] = 
            new JCheckBoxMenuItem(styleNames[count]); // for style
         fontMenu.add(styleItems[count]); // add to font menu
         styleItems[count].addItemListener(styleHandler); // handler
      }

      formatMenu.add(fontMenu); // add Font menu to Format menu
      bar.add(formatMenu); // add Format menu to menu bar
     
      // set up label to display text
      displayJLabel = new JLabel("Texto Simples", SwingConstants.CENTER);
      displayJLabel.setForeground(colorValues[0]);
      displayJLabel.setFont(new Font("Serif", Font.PLAIN, 72));

      getContentPane().setBackground(Color.CYAN); // set background
      add(displayJLabel, BorderLayout.CENTER); // add displayJLabel
   } // end MenuFrame constructor

   // inner class to handle action events from menu items
   private class ItemHandler implements ActionListener{
      // process color and font selections
      @Override
      public void actionPerformed(ActionEvent event) {
         // process color selection
         for (int count = 0; count < colorItems.length; count++){
            if (colorItems[count].isSelected()) {
               displayJLabel.setForeground(colorValues[count]);
               break;
            } 
         } 

         // process font selection
         for (int count = 0; count < fonts.length; count++) {
            if (event.getSource() == fonts[count]) {
               displayJLabel.setFont(
                  new Font(fonts[count].getText(), style, 72));
            }
         }

         repaint(); // redraw application
      } 
   } // end class ItemHandler

   // inner class to handle item events from checkbox menu items
   private class StyleHandler implements ItemListener{
      // process font style selections
      @Override
      public void itemStateChanged(ItemEvent e){
         String name = displayJLabel.getFont().getName(); // current Font
         Font font; // new font based on user selections

         // determine which CheckBoxes are checked and create Font
         if (styleItems[0].isSelected() && 
              styleItems[1].isSelected())
            font = new Font(name, Font.BOLD + Font.ITALIC, 72);
         else if (styleItems[0].isSelected())
            font = new Font(name, Font.BOLD, 72);
         else if (styleItems[1].isSelected())
            font = new Font(name, Font.ITALIC, 72);
         else
            font = new Font(name, Font.PLAIN, 72);

         displayJLabel.setFont(font);
         repaint(); // redraw application
      } 
   } // end class StyleHandler
} // end class MenuFrame