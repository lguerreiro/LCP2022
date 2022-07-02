package aula06;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	private JLabel lb1, lb2, lb3;
	
	public LabelFrame() {
		super("Testando JLabel");
		setLayout(new FlowLayout( ));
		lb1 = new JLabel("Primeiro label");
		lb1.setToolTipText ("Dica para o label");
		add(lb1);
		lb2 = new JLabel("Segundo label");
		lb2.setToolTipText ("Você está no segundo label");
		add(lb2);
		lb3 = new JLabel();
		lb3.setText("Defini o terceiro label");
		lb3.setHorizontalTextPosition(SwingConstants.RIGHT);
		add(lb3);
	}
}