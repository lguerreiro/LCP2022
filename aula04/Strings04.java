package aula04;

import java.util.Arrays;
import java.util.Comparator;

public class Strings04 {
	
	static void maior01(String frase){
		String[] tokens = frase.split(" ");
		int maior = 0;
		String palavraMaior = "";
		for (String t : tokens){
			if (t.length() > maior){
				maior = t.length();
				palavraMaior = t;
			}
		}
		System.out.printf("%ntemos %d palavras, sendo que a maior é: %s", tokens.length, palavraMaior);
	}
	
	
	static void maior02(String frase){
        
        String[] tokens = frase.split(" ");
        
        String palavraMaior = Arrays.stream(tokens).max(Comparator.comparingInt(String::length)).get();
        System.out.printf("%ntemos %d palavras, sendo que a maior é: %s", tokens.length, palavraMaior);
    }
	
	static String mudaletra(String entrada){
		
		String final1 = entrada.toLowerCase();
		char[] chars = final1.toCharArray();
		
		String nova = "";
		for (int i = 0; i < chars.length; i++){
			if (i % 2 == 0)
				nova += Character.toUpperCase(chars[i]);
			else
				nova += chars[i];
		}
		
		return nova;
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		maior01("este é um exemplo de frase");
		maior02("este é um exemplo de frase");
		System.out.println();
		System.out.println(mudaletra("NEsTEEStilo"));

	}

}
