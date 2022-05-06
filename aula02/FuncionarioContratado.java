package java001;

public class FuncionarioContratado extends FuncionarioAbstrato{
	
	private double valorHora;
	private double qtdeHoras;
	
	public FuncionarioContratado(String nome, double valorHora, double qtdeHoras) {
		super(nome);
		if (valorHora < 0) {
			System.out.println("salário inválido");
		}else {
			this.valorHora = valorHora;
			this.qtdeHoras = qtdeHoras;
		}
	}
	
	public void setValorHora(double valorHora) {
		if (valorHora < 0) {
			System.out.println("salário inválido");
		}else {
			this.valorHora = valorHora;
		}
	}
	
	public double getvalorHora() {
		return valorHora;
	}
	
	
	public void setqtdeHoras(double qtdeHoras) {
		this.qtdeHoras = qtdeHoras;
	}
	
	public double getqtdeHoras() {
		return valorHora;
	}
	
	@Override
	public double definirSalario() {
		if (getqtdeHoras() <= 40)
			return getqtdeHoras() * getvalorHora();
		else
			return 40 * getvalorHora() + ((getqtdeHoras() - 40) * getvalorHora() * 1.5);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " trabalha por contrato e receberá " + definirSalario();
	}


}
