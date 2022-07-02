package aula06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxFrame extends JFrame{
	
	private final JComboBox<String> comboCores;
	private static final String[] cores = {"Azul", "Amarelo", "Vermelho", "Branco", "Verde"};
	private static final Color[] listaCores = {Color.BLUE, Color.YELLOW, Color.RED, Color.WHITE, Color.GREEN};
	
	public ComboBoxFrame() {
		super("Seleção Cores");
		setLayout(new FlowLayout());
		
		getContentPane().setBackground(Color.BLUE);
				
		comboCores = new JComboBox<String>(cores);
		comboCores.setMaximumRowCount(3);
		
		comboCores.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent e) {
						if (e.getStateChange() == ItemEvent.SELECTED) {
							System.out.println(comboCores.getSelectedIndex());
							getContentPane().setBackground(listaCores[comboCores.getSelectedIndex()]);
						}
					}
				}
		);
		add(comboCores);		
	}

}
