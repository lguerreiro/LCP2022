package java001;

public class TestaInterface {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.setNome("João");
		prof.setSalario(500);
		prof.setHorasAula(20);
		System.out.println(prof.exibeFuncionario());
		
		FuncionarioGeral func = new FuncionarioGeral();
		func.setNome("José");
		func.setSalario(400);
		System.out.println(func.exibeFuncionario());
		
	}

}
