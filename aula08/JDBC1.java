package aula08;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC1 {
	
	private static Connection db;
	private static Statement st;
	
	private static void criaTabela() {
		try {
			st.executeUpdate("CREATE TABLE Aluno(codigo int PRIMARY KEY, nome VARCHAR(30));");
			System.out.println("Tabela Aluno criada com sucesso");
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na criação da tabela Aluno");
			e.printStackTrace();
		}		
	}
	
	private static void insereAluno(int chave, String nome) {
		try {
			st.executeUpdate(String.format("INSERT INTO Aluno VALUES('%d', '%s')", chave, nome));
			System.out.println("Dados inseridos com sucesso");
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na inserção de dados");
			e.printStackTrace();
		}		
	}
	
	private static void selectAlunos() {
		try {
			ResultSet rs = st.executeQuery("SELECT * FROM Aluno");
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				System.out.printf("Codigo = %d, Nome = %s%n", codigo, nome);
			}
			System.out.println("Fim da consulta de alunos");
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na seleção de todos os alunos");
			e.printStackTrace();
		}		
	}
	
	private static void selectAlunoPorChave(int chave) {
		try {
			ResultSet rs = st.executeQuery(String.format("SELECT * FROM Aluno WHERE codigo = " + chave));
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				System.out.printf("Codigo = %d, Nome = %s%n", codigo, nome);
			}
			System.out.println("Fim da consulta de alunos pela chave " + chave);
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na consulta de dados");
			e.printStackTrace();
		}		
	}
	
	private static void atualizaNome(int chave, String novoNome) {
		try {
			st.executeUpdate(String.format("UPDATE Aluno SET nome='%s' WHERE codigo = '%d'", novoNome, chave));
			System.out.println("Dados atualizados com sucesso");
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na atualização de dados");
			e.printStackTrace();
		}		
	}
	
	private static void excluirAluno(int chave) {
		try {
			st.executeUpdate(String.format("DELETE FROM Aluno WHERE codigo = '%d'", chave));
			System.out.println("Comando de exclusão executado com sucesso");
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na exclusão de dados");
			e.printStackTrace();
		}		
	}
	
	private static void PSSelectAlunoPorChave(int chave) {
		try {
			PreparedStatement ps = db.prepareStatement("SELECT * FROM Aluno WHERE codigo = ?");
			ps.setInt(1, chave);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int codigo = rs.getInt("codigo");
				String nome = rs.getString("nome");
				System.out.printf("Codigo = %d, Nome = %s%n", codigo, nome);
			}
			System.out.println("Fim da consulta de alunos com preparedStatement pela chave " + chave);
			System.out.println("--------------------------------------------");
		} catch (SQLException e) {
			System.err.println("Erro na consulta de dados");
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/aula08";
		String driverName = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		String usuario = "USUARIO";
		String senha = "SENHA";
		
		try {
			db = DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st = db.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		criaTabela();
		insereAluno(1, "marcos");
		insereAluno(2, "nair");
		insereAluno(3, "orlando");
		selectAlunos();
		selectAlunoPorChave(2);
		PSSelectAlunoPorChave(1);
		atualizaNome(2, "NATALIA");
		selectAlunos();
		excluirAluno(2);
		selectAlunos();		

	}

}
