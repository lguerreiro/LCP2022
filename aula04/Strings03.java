package aula04;

public class Strings03 {

	public static void main(String[] args) {
		
		String s = "ABABABABAB";
		s = s.replace("B", "C");
		System.out.println(s);
		String scores = "azul, amarelo, vermelho";
		String[] cores = scores.split(",");
		for (String c : cores)
			System.out.println(c);
		for (String c : cores)
			System.out.println(c.trim());
		int posAmarelo = scores.indexOf("amarelo");
		System.out.println("amarelo começa em: " + posAmarelo);
		String amarelo = scores.substring(posAmarelo, posAmarelo + "amarelo".length());
		System.out.println(amarelo);

	}

}
