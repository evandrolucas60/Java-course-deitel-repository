import java.security.SecureRandom;

//Rola um dado de seis lados 6.000.000 vezes.
public class RollDie {

	public static void main(String[] args) {
		
		//O objeto randomNumbers produzirá números aleatórios seguros
		SecureRandom randomNumbers = new SecureRandom();
		
		int frequency1 = 0; //contagem de 1s lançados
		int frequency2 = 0; //contagem de 1s lançados
		int frequency3 = 0; //contagem de 1s lançados
		int frequency4 = 0; //contagem de 1s lançados
		int frequency5 = 0; //contagem de 1s lançados
		int frequency6 = 0; //contagem de 1s lançados

		//soma 6.000.000 lançamentos de um dado
		for(int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6);//número entre 1 e 6
			
			//usa o valor 1-6 para as faces a fim de determinar qual contador incrementar
			switch (face) {
			case 1:
				++frequency1;
				break;
			case 2:
				++frequency2;
				break;
			case 3:
				++frequency3;
				break;
			case 4:
				++frequency4;
				break;
			case 5:
				++frequency5;
				break;
			case 6:
				++frequency6;
				break;
			}
		}
		
		System.out.println("Face\tFrequency");
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", 
				frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
		
	}

}//fim da classe RollDie
