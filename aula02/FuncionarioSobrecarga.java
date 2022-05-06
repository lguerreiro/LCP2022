package java001;

public class FuncionarioSobrecarga {
	
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
	
	void setSalario(double salario, double p_bonus){
		this.salario = salario + salario * p_bonus;
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
	
	public static void main(String[] args) {
		
		FuncionarioSobrecarga engenheiro = new FuncionarioSobrecarga();
		engenheiro.setNome("José");
		engenheiro.setCargo("Engenheiro");
		engenheiro.setSalario(5000);

		FuncionarioSobrecarga gerente = new FuncionarioSobrecarga();
		gerente.setNome("João");
		gerente.setCargo("Gerente de Vendas");
		gerente.setSalario(5000.00, 0.15);
		
		System.out.printf("Salário do %s %s é %.2f", engenheiro.getCargo(), engenheiro.getNome(), engenheiro.getSalario());
		System.out.println();
		System.out.printf("Salário do %s %s é %.2f", gerente.getCargo(), gerente.getNome(), gerente.getSalario());
	}

}
