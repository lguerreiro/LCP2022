package java01;

public class OlaObjeto {

	void cumprimentar(String nome){
		System.out.print("Olá, " + nome + "!");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OlaObjeto obj = new OlaObjeto();
		obj.cumprimentar("mundo");

	}

}
