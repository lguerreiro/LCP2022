package aula03;

import java.util.Enumeration;
import java.util.Vector;

public class ExemploVector {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.addElement("Pessoa 1");
		vec.addElement("Pessoa 2");
		vec.addElement("Pessoa 3");
		Enumeration<String> e = vec.elements();
		while (e.hasMoreElements()){
			System.out.println(e.nextElement());
		}

	}

}
