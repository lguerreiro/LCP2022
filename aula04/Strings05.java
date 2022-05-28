package aula04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings05 {
	
	public static void placas(){
        System.out.println("ABC-1234".matches("[A-Z]{3}-[0-9]{4}"));
        System.out.println("ABC-12345".matches("[A-Z]{3}-[0-9]{4}"));
        System.out.println("ABC1234".matches("[A-Z]{3}-[0-9]{4}"));
        
        System.out.println("ABC1D23".matches("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}"));      
        System.out.println("ABC1234".matches("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}"));        
        System.out.println("ABC12X4".matches("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}"));
	}

	

	public static void placas2(){
        
		Pattern pat = Pattern.compile("[A-Z]{3}-[0-9]{4}");
		String placa = "ABC-1234 " + "ABC-12345 " + "DCB-3598 " + "ABC1234 " + "ABC1D23";
		        
		Matcher mat = pat.matcher(placa);
		while (mat.find())
			System.out.println(mat.group());
		}


	static void regex(){
        
        System.out.println("123".matches("\\d\\d\\d"));
        System.out.println("123".matches("\\d{3}"));
        System.out.println("13".matches("\\d\\d\\d"));
        System.out.println("13d".matches("\\d\\dd"));
        System.out.println("oi".matches("\\w\\w"));
        System.out.println("aa".matches("\\w\\w"));
        System.out.println("X".matches("[A-z]"));
        System.out.println("X1".matches("[A-z][0-9]"));
        System.out.println("1".matches("[A-z][0-9]"));
        System.out.println("X12".matches("[A-z][0-9]"));
        System.out.println("X12".matches("[A-z][0-9]*"));
        System.out.println("X".matches("[A-z][0-9]*"));
        System.out.println("X".matches("[A-z][0-9]+"));
        System.out.println("X".matches("[A-z][0-9]?"));
        System.out.println("X1".matches("[A-z][0-9]?"));
        System.out.println("X12".matches("[A-z][0-9]?"));
        System.out.println("X12".matches("[A-z][0-9]{2,4}"));
        System.out.println("X12345".matches("[A-z][0-9]{2,4}"));
        System.out.println("X 1".matches("[A-z]\\s[0-9]?"));
        System.out.println("X1".matches("[A-z]\\s[0-9]?"));
        
	}


	public static void main(String[] args) {
		
		regex();
		placas();
		placas2();

	}

}
