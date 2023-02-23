
public class InitArray {
	
	/*
	 * A linha 15 utiliza o modificador final para declarar a vari�vel constante ARRAY_LENGTH, 
	 * com o valor 10. Vari�veis constantes devem ser inicializadas antes de serem utilizadas
	 *  e n�o podem ser modificadas depois. Se voc� tentar modificar uma vari�vel final depois 
	 *  que ela � inicializada na declara��o, o compilador emite uma mensagem de erro como:
	 *  
				cannot assign a value to final variable nomeDaVari�vel
	 */

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10; //declara constante
		int[] array = new int[ARRAY_LENGTH];//cria o array
		
		//calcula valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter ++) {
			array[counter] = 2 + 2 * counter;
		}

		System.out.printf("%s%8s%n", "Index", "Value");//t�tulos de coluna
		
		//gera sa�da do valor de cada elemento do array
		for(int counter = 0; counter < array.length; counter ++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
	}

}//fim da classe InitArray
