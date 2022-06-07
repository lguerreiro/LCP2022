package aula05;

public class Excecoes0 {

	public static void main(String[] args) {
		
		String[] nomes = {"Aluno1", "Aluno2", "Aluno3"};
		int[] notas_alunos = new int[3];
		int[] notas = {4, 7, 8, 9};
		        
		for (int i = 0; i < notas.length; i++){
			notas_alunos[i] = notas[i];
		}

		System.out.printf("%n%s%10s", "Aluno", "Nota");
		System.out.printf("%n---------------");

		for (int i = 0; i < nomes.length; i++){
			System.out.printf("%n%5s%8d", nomes[i], notas_alunos[i]);
		}

	}

}
