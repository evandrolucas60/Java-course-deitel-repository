package application;
//Compara inteiros utilizando instruções if, operadores relacionais
// e operadores de igualdade.

import java.util.Scanner;// programa utiliza a classe Scanner

public class PriemiroProgram03_Comparison {

	// método main inicia a execução do aplicativo Java
	public static void main(String[] args) {
		
		// cria Scanner para obter entrada a partir da linha de comando
		Scanner sc = new Scanner(System.in);
		
		int num1; //primeiro numero 
		int num2; //segundo numero
		
		System.out.print("Enter first integer: ");//prompt
		num1 = sc.nextInt();
		System.out.print("enter second integer: ");//prompt
		num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.printf("%d == %d%n", num1, num2);
		}
		
		if (num1 != num2) {
			System.out.printf("%d != %d%n", num1, num2);
		}
		
		if (num1 < num2) {
			System.out.printf("%d < %d", num1, num2);
		}
		
		if (num1 > num2) {
			System.out.printf("%d > %d%n", num1, num2);
		}
		
		if (num1 <= num2) {
			System.out.printf("%d <= %d%n", num1, num2);
		}
		if (num1 >= num2) {
			System.out.printf("%d >= %d%n", num1, num2);
		}
		sc.close();
	}// fim do programa

}// fim da class
