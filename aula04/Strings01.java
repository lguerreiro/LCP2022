package aula04;

public class Strings01 {

	public static void main(String[] args) {
		
		
		String s1 = "olá a todos";
		char[] charArray = new char[5];
		System.out.printf("Tamanho de %s é: %d", s1, s1.length());
		System.out.printf("%n%s invertida = ", s1);
		for (int i = s1.length() - 1; i >= 0; i--)
			System.out.print(s1.charAt(i));
		s1.getChars(0, 5, charArray, 0);
		System.out.printf("%nLetras selecionadas: ");
		for (char character : charArray)
			System.out.print(character);

	}

}
