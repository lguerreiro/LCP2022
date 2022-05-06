package java001;

public class FuncionariosPagamentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncionarioAssalariado func01 = new FuncionarioAssalariado("José", 1000);
		FuncionarioContratado func02 = new FuncionarioContratado("João", 30, 50);
		FuncionarioContratado func03 = new FuncionarioContratado("Maria", 40, 40);
		
		System.out.println("Processados pagamentos:");
		System.out.println(func01);
		System.out.println(func02);
		System.out.println(func03);
		

	}

}
