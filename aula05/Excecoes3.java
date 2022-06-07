package aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes3 {
	
	public static int divisao(int numerador, int denominador) throws ArithmeticException {
	    return numerador / denominador; 
	}

	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
	    boolean continuarLoop = true; 

	    do{
	        try{ 
	            System.out.print("Digite o numerador (inteiro): "); 
	            int numerador = scanner.nextInt(); 
	            System.out.print("Digite o denominador (inteiro): "); 
	            int denominador = scanner.nextInt();
	            int resultado = divisao(numerador, denominador); 
	            System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado); 
	            continuarLoop = false; 
	        }catch (InputMismatchException inputMismatchException) {
	            System.err.printf("%nExceção: %s%n", inputMismatchException); 
	            scanner.nextLine(); 
	            System.out.printf("Você deve inserir um número inteiro. Tente novamente.%n%n");
	        }catch (ArithmeticException arithmeticException) {
	            System.err.printf("%nExceção: %s%n", arithmeticException); 
	            System.out.printf("Denominador deve ser diferente de zero. Tente novamente.%n%n");
	        }
	    } while (continuarLoop); 
	}


}
