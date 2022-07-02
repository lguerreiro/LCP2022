package aula07;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class SliderFrame extends JFrame 
{
   private final JSlider diameterJSlider; // slider to select diameter
   private final OvalPanel myPanel; // panel to draw circle

   // no-argument constructor
   public SliderFrame() 
   {
      super("Slider Demo");

      myPanel = new OvalPanel(); // create panel to draw circle
      myPanel.setBackground(Color.YELLOW); 

      // set up JSlider to control diameter value
      diameterJSlider = 
         new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
      diameterJSlider.setMajorTickSpacing(10); // create tick every 10
      diameterJSlider.setPaintTicks(true); // paint ticks on slider

      // register JSlider event listener
      diameterJSlider.addChangeListener(
         new ChangeListener() // anonymous inner class
         {  
            // handle change in slider value
            @Override
            public void stateChanged(ChangeEvent e)
            {
               myPanel.setDiameter(diameterJSlider.getValue());
            } 
         } 
      ); 

      add(diameterJSlider, BorderLayout.SOUTH); 
      add(myPanel, BorderLayout.CENTER); 
   } 
} // end class SliderFrame