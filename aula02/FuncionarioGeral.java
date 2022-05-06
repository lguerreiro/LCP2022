package java001;

public class FuncionarioGeral implements FuncionarioInterface {
	private String nome;
	private double salario;
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setSalario(double salario) {
		this.salario = salario;
		
	}

	@Override
	public double getSalario() {
		return salario;
	}

	@Override
	public double getDespesas() {
		return getSalario() * 1.11;
	}

	@Override
	public String exibeFuncionario() {
		return "Nome = " + getNome() + " salário de " + getSalario() + " sem despesas adicionais";
	}
}
