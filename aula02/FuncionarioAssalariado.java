package java001;

public class FuncionarioAssalariado extends FuncionarioAbstrato{
	
	private double salarioSemanal;
	
	public FuncionarioAssalariado(String nome, double salarioSemanal) {
		super(nome);
		if (salarioSemanal < 0) {
			System.out.println("salário inválido");
		}else {
			this.salarioSemanal = salarioSemanal;
		}
	}
	
	public void setSalarioSemanal(double salarioSemanal) {
		if (salarioSemanal < 0) {
			System.out.println("salário inválido");
		}else {
			this.salarioSemanal = salarioSemanal;
		}
	}
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	
	@Override
	public double definirSalario() {
		return getSalarioSemanal();
	}
	
	@Override
	public String toString() {
		return super.toString() + " trabalha semanalmente com salário de " + getSalarioSemanal();
	}


}
