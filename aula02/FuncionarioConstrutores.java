package java001;

public class FuncionarioConstrutores {
	
	String nome;
	String cargo;
	double salario;
	
	public FuncionarioConstrutores(String nome){
		this.nome = nome;
	}
	public FuncionarioConstrutores(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
	}
	public FuncionarioConstrutores(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	String getNome() {
		return this.nome;
	}
	
	String getCargo() {
		return this.cargo;
	}
	
	double getSalario() {
		return this.salario;
	}
	
	public static void main(String[] args){
		FuncionarioConstrutores func01 = new FuncionarioConstrutores("João");
		FuncionarioConstrutores func02 = new FuncionarioConstrutores("José", "Engenheiro");
		FuncionarioConstrutores func03 = new FuncionarioConstrutores("Maria", "Gerente", 5000);
	}



}
