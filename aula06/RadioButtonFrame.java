package aula06;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	
	private final JTextField textField;
	private final Font fonteSimples;
	private final Font fonteNegrito;
	private final Font fonteItalico;
	private final Font fonteNegritoItalico;
	private final JRadioButton rbSimples;
	private final JRadioButton rbNegrito;
	private final JRadioButton rbItalico;
	private final JRadioButton rbNegritoItalico;
	private final ButtonGroup rbGrupo;
	
	public RadioButtonFrame() {
		super("Seleções com RadioButton");
		setLayout(new FlowLayout());
		textField = new JTextField("Observe as mudanças na fonte", 25);
		add(textField);
		
		rbSimples = new JRadioButton("Simples", true);
		rbNegrito = new JRadioButton("Negrito", false);
		rbItalico = new JRadioButton("Itálico", false);
		rbNegritoItalico = new JRadioButton("Negrito e Itálico", false);
		
		rbGrupo = new ButtonGroup();
		rbGrupo.add(rbSimples);
		rbGrupo.add(rbNegrito);
		rbGrupo.add(rbItalico);
		rbGrupo.add(rbNegritoItalico);
		
		add(rbSimples);
		add(rbNegrito);
		add(rbItalico);
		add(rbNegritoItalico);
		
		fonteSimples = new Font("Serif", Font.PLAIN, 14);
		fonteNegrito = new Font("Serif", Font.BOLD, 14);
		fonteItalico = new Font("Serif", Font.ITALIC, 14);
		fonteNegritoItalico = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		rbSimples.addItemListener(new RadioHandler(fonteSimples));
		rbNegrito.addItemListener(new RadioHandler(fonteNegrito));
		rbItalico.addItemListener(new RadioHandler(fonteItalico));
		rbNegritoItalico.addItemListener(new RadioHandler(fonteNegritoItalico));
	}
	
	private class RadioHandler implements ItemListener{
		private Font fonte;
		public RadioHandler(Font f) {
			fonte = f;
		}
		@Override
		public void itemStateChanged(ItemEvent e) {
			textField.setFont(fonte);
		}		
	}

}
