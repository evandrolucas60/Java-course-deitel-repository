package application;
//Programa de impress�o de texto

public class PrimeiroProgram01
{
	//m�todo main inicia a execu��o de applicativo Java
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Java Programming");
		
		// Imprimindo uma linha de texto com m�ltiplas instru��es.
		System.out.println();
		System.out.print("Welcome to ");
		System.out.println("Java programming");
		
		// Imprimindo m�ltiplas linhas de texto com uma �nica instru��o.
		System.out.println();
		System.out.println("Welcome\nto\nJava\nProgramming");
		
		// Exibindo m�ltiplas linhas com o m�todo System.out.printf.
		System.out.printf("%n%s%n%s%n",
				"Welcome to", "Java Programming");
	} //Fim do m�todo main
}//fim da classe PrimeiroPrograma01
