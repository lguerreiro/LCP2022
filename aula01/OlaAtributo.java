package java01;

public class OlaAtributo {
	
	String palavra = "mundo";
	
	void cumprimentar() {
		System.out.print("Olá, " + this.palavra + "!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OlaAtributo obj = new OlaAtributo();
		obj.cumprimentar();
	}

}
