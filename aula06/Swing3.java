package aula06;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Swing3 {

	public static void main(String[] args) {
			
		int entrada;
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o");
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Este par�metro � do t�tulo da mensagem", JOptionPane.YES_NO_CANCEL_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Sim/N�o", JOptionPane.YES_NO_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Ok/Cancelar", JOptionPane.OK_CANCEL_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Vamos ver os �cones?","Op��o �nica",JOptionPane.DEFAULT_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Sim/N�o/Cancelar (simples)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Sim/N�o/Cancelar (aviso)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirma��o", "Sim/N�o/Cancelar (erro)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		int respostaCerta;
		do {
			respostaCerta = JOptionPane.showConfirmDialog(null, "O Brasil vai ser Hexa em 2022?", "Sim/N�o/Cancelar (pergunta)", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		} while(respostaCerta == 1);
		ImageIcon icon = new ImageIcon("images/copa.png");
		JOptionPane.showMessageDialog(null, "Eu tamb�m acho!", "Concordo", JOptionPane.PLAIN_MESSAGE, icon);
		

	}

}
