package aula06;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	
	private final JTextField textField;
	private final JCheckBox cbNegrito;
	private final JCheckBox cbItalico;
	
	public CheckBoxFrame() {
		super("Seleções com JCheckBox");
		setLayout(new FlowLayout());
		textField = new JTextField("Observe as mudanças na fonte", 20);
		add(textField);
		cbNegrito = new JCheckBox("Negrito");
		cbItalico = new JCheckBox("Itálico");
		add(cbNegrito);
		add(cbItalico);
		
		CheckBoxHandler cbHandler = new CheckBoxHandler();
		cbNegrito.addItemListener(cbHandler);
		cbItalico.addItemListener(cbHandler);
	}
	
	private class CheckBoxHandler implements ItemListener{
		Font fonte = null;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (cbNegrito.isSelected() && cbItalico.isSelected())
				fonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			else if (cbNegrito.isSelected())
				fonte = new Font("Serif", Font.BOLD, 14);
			else if (cbItalico.isSelected())
				fonte = new Font("Serif", Font.ITALIC, 14);
			else
				fonte = new Font("Serif", Font.PLAIN, 14);
			textField.setFont(fonte);
		}		
	}

}
