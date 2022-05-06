package java001;

public class FuncionarioBonus {
	
	String nome;
	String cargo;
	double salario;
	private final double BONUS_ANUAL = 0.07;
	
	public FuncionarioBonus(String nome){
		this.nome = nome;
	}
	public FuncionarioBonus(String nome, String cargo){
		this.nome = nome;
		this.cargo = cargo;
	}
	public FuncionarioBonus(String nome, String cargo, double salario){
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
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
	
	public void aumento_anual(){
		this.salario += this.salario * this.BONUS_ANUAL;
	}
	/*
	public void atualizaBonus(double novo_bonus_anual) {
		this.BONUS_ANUAL = novo_bonus_anual;
	}
	*/
	public static void main(String[] args){
		FuncionarioBonus func = new FuncionarioBonus("José", "Engenheiro", 5000);
		double salario_atual = func.getSalario();
		func.aumento_anual();
		double novo_salario = func.getSalario();
		System.out.printf("Salario anterior = %f, novo salario = %f", salario_atual, novo_salario);
	}


}
