package java001;

public class FuncionarioStatic2 {
	
	private String nome;
	private String cargo;
	private double salario;
	private static int total_funcionarios = 0;
	public FuncionarioStatic2(String nome){
		this(nome, "", 0);
	}
	public FuncionarioStatic2(String nome, String cargo){
		this(nome, cargo, 0);
	}
	public FuncionarioStatic2(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		total_funcionarios++;
	}
	public static int getTotalFuncionarios() {
		return total_funcionarios;
	}
	public static void main(String[] args){
		System.out.println("classe: " + FuncionarioStatic2.getTotalFuncionarios());
		FuncionarioStatic2 func01 = new FuncionarioStatic2("João");
		System.out.println("classe: " + FuncionarioStatic2.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		FuncionarioStatic2 func02 = new FuncionarioStatic2("José", "Engenheiro");
		System.out.println("classe: " + FuncionarioStatic2.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		System.out.println("func2: " + func02.getTotalFuncionarios());
		FuncionarioStatic2 func03 = new FuncionarioStatic2("Maria", "Gerente", 5000);
		System.out.println("classe: " + FuncionarioStatic2.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		System.out.println("func2: " + func02.getTotalFuncionarios());
		System.out.println("func3: " + func03.getTotalFuncionarios());
	}

}
