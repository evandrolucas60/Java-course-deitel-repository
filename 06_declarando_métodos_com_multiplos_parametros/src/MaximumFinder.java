import java.util.Scanner;

//método maximum declarado pelo programador com três parâmtros double
public class MaximumFinder {

	//obtém três valores de ponto flutuante e localiza o valor máximo
	public static void main(String[] args) {
		//cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//solicita e insere três valores de ponto flutuante
		System.out.print("Enter three floating-point values separade by spaces: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		//determina o valor máximo
		double result = maximum(num1, num2, num3);
		
		//exibe o valor máximo
		System.out.println("Maximum is: "+ result);
		input.close();
	}
	
	//retorna o máximo dos seus três parâmetros de double
	public static double maximum(double x, double y, double z) {
		
		double maximumValue = x; //supõe qye x é o maior valor inicial
		
		//determina se y é maior que maximumValue
		if (y > maximumValue) {
			maximumValue = y;
		}
		
		//determina se z é maior que maximumValue
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		return maximumValue;
	}
	
	/*
	 *  1. Usando o próprio nome de método para chamar outro método da mesma classe, como maximum (number1, number2, number3)
		na linha 18.
		
		2. Utilizar uma variável que contém uma referência a um objeto, seguido por um ponto (.) e o nome do método para chamar
		um método não static do objeto referenciado — tal como a chamada de método na linha 16 da classe, myAccount.
		getName(), que chama um método da classe Account a partir do método main de AccountTest. Métodos não static são
		normalmente chamados métodos de instância.
		
		3. Utilizar o nome de classe e um ponto (.) para chamar um método static de uma classe — como Math.sqrt(900.0).
	 */

}//fim da classe MaximumFinder
