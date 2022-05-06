package java001;

public class FuncionarioStatic1 {
	
	private String nome;
	private String cargo;
	private double salario;
	private static int total_funcionarios = 0;
	public FuncionarioStatic1(String nome){
		this.nome = nome;
		total_funcionarios++;
	}
	public FuncionarioStatic1(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
		total_funcionarios++;
	}
	public FuncionarioStatic1(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		total_funcionarios++;
	}
	public static int getTotalFuncionarios() {
		return total_funcionarios;
	}
	public static void main(String[] args){
		System.out.println("classe: " + FuncionarioStatic1.getTotalFuncionarios());
		FuncionarioStatic1 func01 = new FuncionarioStatic1("João");
		System.out.println("classe: " + FuncionarioStatic1.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		FuncionarioStatic1 func02 = new FuncionarioStatic1("José", "Engenheiro");
		System.out.println("classe: " + FuncionarioStatic1.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		System.out.println("func2: " + func02.getTotalFuncionarios());
		FuncionarioStatic1 func03 = new FuncionarioStatic1("Maria", "Gerente", 5000);
		System.out.println("classe: " + FuncionarioStatic1.getTotalFuncionarios());
		System.out.println("func1: " + func01.getTotalFuncionarios());
		System.out.println("func2: " + func02.getTotalFuncionarios());
		System.out.println("func3: " + func03.getTotalFuncionarios());
	}

}
