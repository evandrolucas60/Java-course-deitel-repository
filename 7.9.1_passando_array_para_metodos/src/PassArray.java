
public class PassArray {
	/*
	 * Quando um argumento para um m�todo for um array inteiro ou um elemento de
	 * array individual de um tipo por refer�ncia, o m�todo chamado recebe uma c�pia
	 * da refer�ncia. Entretanto, quando um argumento para um m�todo for um elemento
	 * de array individual de um tipo primitivo, o m�todo chamado recebe uma c�pia
	 * do valor do elemento.
	 */

	// cria modifyArray e modifyElement
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out
				.printf("Effects of passing reference to entire array:%n" + "The values of the original array are:%n");

		// gera sa�da de elementos do array original
		for (int value : array) {
			System.out.printf("   %d", value);
		}

		modifyArray(array);// passa a refencia do array
		System.out.printf("%n%nThe values of the modify array are: %n");
		for (int value : array) {
			System.out.printf("   %d", value);
		}

		System.out.printf("%n%nEffects of passing array element value:%n" + "array[3] before modifyElement: %d%n",
				array[3]);
		
		modifyElement(array[3]); //tentar modifica o array[3]
		System.out.printf(
				"array[3] after modifyElement: %d%n", array[3]);
	}

	// multiplica cada elemento do array por 2
	public static void modifyArray(int[] array2) {
		for (int counter = 0; counter < array2.length; counter++) {
			array2[counter] *= 2;
		}
	}

	// multiplica argumento por 2
	public static void modifyElement(int element) {
		element *= 2;
		System.out.printf("Value of element in modifyElement: %d%n", element);
	}
}
