package java001;

public class Gerente extends Funcionario {
	
	double bonus;
	
	void setBonus(double p_bonus) {
		this.bonus = p_bonus*salario;
	}
	
	double getBonus(){
		return this.bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		gerente.setNome("José");
		gerente.setCargo("Gerente de Vendas");
		gerente.setSalario(5000);
		gerente.setBonus(0.15);
		double valor_bonus = gerente.getBonus();

		System.out.println(valor_bonus);
	}

}
