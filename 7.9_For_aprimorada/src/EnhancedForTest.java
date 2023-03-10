
public class EnhancedForTest {

	public static void main(String[] args) {
		//A instru��o for aprimorada s� pode ser utilizada
		//para obter elementos de um array - ela n�o pode ser
		//usada para modificar elementos.
		
		/*
		 * A instru��o for aprimorada pode ser utilizada no lugar da instru��o for 
		 * controlada por contador sempre que o loop de c�digo por um array n�o exigir
		 * acesso ao contador que indica o �ndice do elemento do array atual. Por exemplo, 
		 * somar os inteiros em um array exige acesso apenas aos valores de elemento � 
		 * o �ndice de cada elemento � irrelevante.
		 */
		
		int [] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		//adiciona o valor de cada elemento ao total
		for (int number : array) {
			total += number;
		}
		
		System.out.printf("Total of array elements: %d%n", total);
	}

}//fim da classe EnhancedForTest
