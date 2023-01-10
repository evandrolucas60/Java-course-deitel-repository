package application;

import java.util.Scanner; // programa utiliza a classe Scanner

//Programa de adi��o que insere dois n�meros, ent�o exibe a soma deles.


public class PrimeiroProgram02 {

	// m�todo main inicia a execu��o do aplicativo Java
	public static void main(String[] args) {
		// cria um Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		int num1; //primeiro n�mero a somar
		int num2; //segundo n�mero a somar
		int sum; //soma de number1 e number2
		
		System.out.print("Enter the first integer: ");//prompt
		num1 = sc.nextInt(); //l� o primeiro n�mero fornecido pelo usu�rio
		
		System.out.print("Enter the second integer: ");
		num2 = sc.nextInt();//l� o segundo n�mero fornecido pelo usu�rio
		
		sum = num1 + num2; // soma os n�meros, depois armazena o total em sum
		
		System.out.printf("Sum is %d%n", sum);//exibe a soma
		sc.close();
	}//fim do m�todo main

}//fim do programa
