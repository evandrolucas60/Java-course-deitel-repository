
public class InitArray {

	public static void main(String[] args) {
		/*
		 * Quando o compilador encontrar uma declara��o de array 
		 * que inclua uma lista de inicializador, ele conta o n�mero 
		 * de inicializadores na lista para determinar o tamanho do
		 *  array, depois configura a opera��o new apropriada �nos bastidores�.
		 */

		//A lista de inicializador especifica o valor inicial de cada elemento
		int[] array = {32, 27, 64, 18, 95,14, 90,70, 60, 37};
		
		System.out.printf("%s%8s%n", "Index", "Value");//t�tulos de coluna
		
		//geera sa�da do valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}
