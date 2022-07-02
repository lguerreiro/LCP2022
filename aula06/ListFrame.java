package aula06;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {
	
	private final JList<String> listaCores;
	private final Color[] refCores = {Color.BLUE, Color.YELLOW, Color.RED, Color.WHITE, Color.GREEN};
	private final String[] todasCores = {"Azul", "Amarelo", "Vermelho", "Branco", "Verde"};
	
	public ListFrame() {
		super("Listagem de cores");
		setLayout(new FlowLayout());
		
		listaCores = new JList<String>(todasCores);
		listaCores.setVisibleRowCount(3);
		listaCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(listaCores));
		
		listaCores.addListSelectionListener(
				new ListSelectionListener() {
					
					@Override
					public void valueChanged(ListSelectionEvent e) {
						getContentPane().setBackground(refCores[listaCores.getSelectedIndex()]);
						
					}
				}
			
		);
	}
}
