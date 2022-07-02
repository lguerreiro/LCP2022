package aula06;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Swing3 {

	public static void main(String[] args) {
			
		int entrada;
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação");
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Este parâmetro é do título da mensagem", JOptionPane.YES_NO_CANCEL_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Sim/Não", JOptionPane.YES_NO_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Ok/Cancelar", JOptionPane.OK_CANCEL_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Vamos ver os ícones?","Opção única",JOptionPane.DEFAULT_OPTION);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Sim/Não/Cancelar (simples)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Sim/Não/Cancelar (aviso)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
		entrada = JOptionPane.showConfirmDialog(null, "Mensagem de confirmação", "Sim/Não/Cancelar (erro)", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		int respostaCerta;
		do {
			respostaCerta = JOptionPane.showConfirmDialog(null, "O Brasil vai ser Hexa em 2022?", "Sim/Não/Cancelar (pergunta)", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		} while(respostaCerta == 1);
		ImageIcon icon = new ImageIcon("images/copa.png");
		JOptionPane.showMessageDialog(null, "Eu também acho!", "Concordo", JOptionPane.PLAIN_MESSAGE, icon);
		

	}

}
