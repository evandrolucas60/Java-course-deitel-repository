package application;

import java.util.Scanner; // programa utiliza a classe Scanner

//Programa de adição que insere dois números, então exibe a soma deles.


public class PrimeiroProgram02 {

	// método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		int num1; //primeiro número a somar
		int num2; //segundo número a somar
		int sum; //soma de number1 e number2
		
		System.out.print("Enter the first integer: ");//prompt
		num1 = sc.nextInt(); //lê o primeiro número fornecido pelo usuário
		
		System.out.print("Enter the second integer: ");
		num2 = sc.nextInt();//lê o segundo número fornecido pelo usuário
		
		sum = num1 + num2; // soma os números, depois armazena o total em sum
		
		System.out.printf("Sum is %d%n", sum);//exibe a soma
		sc.close();
	}//fim do método main

}//fim do programa
