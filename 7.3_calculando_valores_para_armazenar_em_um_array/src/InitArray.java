
public class InitArray {
	
	/*
	 * A linha 15 utiliza o modificador final para declarar a variável constante ARRAY_LENGTH, 
	 * com o valor 10. Variáveis constantes devem ser inicializadas antes de serem utilizadas
	 *  e não podem ser modificadas depois. Se você tentar modificar uma variável final depois 
	 *  que ela é inicializada na declaração, o compilador emite uma mensagem de erro como:
	 *  
				cannot assign a value to final variable nomeDaVariável
	 */

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10; //declara constante
		int[] array = new int[ARRAY_LENGTH];//cria o array
		
		//calcula valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter ++) {
			array[counter] = 2 + 2 * counter;
		}

		System.out.printf("%s%8s%n", "Index", "Value");//títulos de coluna
		
		//gera saída do valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter ++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}//fim da classe InitArray
