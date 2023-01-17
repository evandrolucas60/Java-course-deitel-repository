import java.util.Scanner;

//m�todo maximum declarado pelo programador com tr�s par�mtros double
public class MaximumFinder {

	//obt�m tr�s valores de ponto flutuante e localiza o valor m�ximo
	public static void main(String[] args) {
		//cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		//solicita e insere tr�s valores de ponto flutuante
		System.out.print("Enter three floating-point values separade by spaces: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		//determina o valor m�ximo
		double result = maximum(num1, num2, num3);
		
		//exibe o valor m�ximo
		System.out.println("Maximum is: "+ result);
		input.close();
	}
	
	//retorna o m�ximo dos seus tr�s par�metros de double
	public static double maximum(double x, double y, double z) {
		
		double maximumValue = x; //sup�e qye x � o maior valor inicial
		
		//determina se y � maior que maximumValue
		if (y > maximumValue) {
			maximumValue = y;
		}
		
		//determina se z � maior que maximumValue
		if (z > maximumValue) {
			maximumValue = z;
		}
		
		return maximumValue;
	}
	
	/*
	 *  1. Usando o pr�prio nome de m�todo para chamar outro m�todo da mesma classe, como maximum (number1, number2, number3)
		na linha 18.
		
		2. Utilizar uma vari�vel que cont�m uma refer�ncia a um objeto, seguido por um ponto (.) e o nome do m�todo para chamar
		um m�todo n�o static do objeto referenciado � tal como a chamada de m�todo na linha 16 da classe, myAccount.
		getName(), que chama um m�todo da classe Account a partir do m�todo main de AccountTest. M�todos n�o static s�o
		normalmente chamados m�todos de inst�ncia.
		
		3. Utilizar o nome de classe e um ponto (.) para chamar um m�todo static de uma classe � como Math.sqrt(900.0).
	 */

}//fim da classe MaximumFinder
