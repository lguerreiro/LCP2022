package aula06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame {
	
	private final JTextArea taOrigem;
	private final JTextArea taDestino;
	private final JButton copiar;
	
	public TextAreaFrame() {
		super("Testando TextArea e ScrollPane");
		Box box = Box.createHorizontalBox();
		String textoCompleto = "Olá a todos! \n" + 
							    "este é um textArea que tem \n" +
							    "um texto longo que pode ser \n" +
							    "copiado para outro textArea!";
		taOrigem = new JTextArea(textoCompleto, 10, 20);
		box.add(new JScrollPane(taOrigem));
		copiar = new JButton("copiar >>");
		box.add(copiar);
		copiar.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						taDestino.setText(taOrigem.getSelectedText());
					}
				}
		);
		taDestino = new JTextArea(10, 20);
		taDestino.setEditable(false);
		box.add(new JScrollPane(taDestino));
		add(box);
	}

}
