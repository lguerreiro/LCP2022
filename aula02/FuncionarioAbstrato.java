package java001;

public abstract class FuncionarioAbstrato {
	private final String nome;
	
	public FuncionarioAbstrato(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String toString() {
		return "Funcionário = " + getNome();
	}
	
	public abstract double definirSalario();

}
