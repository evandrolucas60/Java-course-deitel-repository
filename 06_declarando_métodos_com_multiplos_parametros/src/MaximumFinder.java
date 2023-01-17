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

}//fim da classe MaximumFinder
