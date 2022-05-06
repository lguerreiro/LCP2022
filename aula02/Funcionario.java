package java001;

public class Funcionario {
	
	String nome;
	String cargo;
	double salario;
	
	void setNome(String nome){
		this.nome = nome;
	}
	
	void setCargo(String cargo){
		this.cargo = cargo;
	}
	
	void setSalario(double salario){
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


}
