package java001;

public class GerenteSobreposicao extends Funcionario {
		
	void setSalario(double salario, double p_bonus) {
		this.salario = salario + p_bonus*salario;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GerenteSobreposicao gerente = new GerenteSobreposicao();
		gerente.setNome("José");
		gerente.setCargo("Gerente de Vendas");
		gerente.setSalario(5000, 0.15);
		double salario_gerente = gerente.getSalario();
		System.out.print("O Salário total é de " + salario_gerente);
	}

}
