package java001;

public class Professor extends FuncionarioGeral{
	
	private int horasAula;
	
	public void setHorasAula(int horas) {
		this.horasAula = horas;		
	}
	
	public int getHorasAula() {
		return horasAula;
	}
	
	@Override
	public double getDespesas() {
		return getSalario() + getHorasAula() * 10;
	}
	
	@Override
	public String exibeFuncionario() {
		return "Nome = " + getNome() + " salário de " + getSalario() + " é professor e tem despesas totais de " + getDespesas();
	}
	
}
