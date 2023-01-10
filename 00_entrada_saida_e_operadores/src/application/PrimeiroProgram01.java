package application;
//Programa de impressão de texto

public class PrimeiroProgram01
{
	//método main inicia a execução de applicativo Java
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Java Programming");
		
		// Imprimindo uma linha de texto com múltiplas instruções.
		System.out.println();
		System.out.print("Welcome to ");
		System.out.println("Java programming");
		
		// Imprimindo múltiplas linhas de texto com uma única instrução.
		System.out.println();
		System.out.println("Welcome\nto\nJava\nProgramming");
		
		// Exibindo múltiplas linhas com o método System.out.printf.
		System.out.printf("%n%s%n%s%n",
				"Welcome to", "Java Programming");
	} //Fim do método main
}//fim da classe PrimeiroPrograma01
