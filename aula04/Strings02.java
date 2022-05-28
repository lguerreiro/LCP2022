package aula04;

public class Strings02 {

	public static void main(String[] args) {
		
		String s1 = "lcp";
		System.out.println(s1 == "lcp"); 
		String s2 = new String("lcp");
		System.out.println(s2 == "lcp");  
		System.out.println(s2.equals(s1));
		System.out.println(s2.equals("lcp"));

	}

}
