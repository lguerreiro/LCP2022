package aula06;

import javax.swing.JOptionPane;

public class Swing4 {

	public static void main(String[] args) {
			
		int entrada;
		Integer[] valores = {3, 5, 8, 9, 13};
		
		int resposta;
		
		resposta = JOptionPane.showOptionDialog(null, 
				"Qual desses valores � par?", 
				"Teste de matem�tica", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				valores, 
				valores[1]);
		if (resposta == 2) {
			JOptionPane.showMessageDialog(null, "Parab�ns! Voc� acertou!");
		}else {
			JOptionPane.showMessageDialog(null, String.format("Foi escolhida a resposta %d e a correta � 8.", valores[resposta]));
		}

	}

}
