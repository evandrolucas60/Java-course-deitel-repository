import java.security.SecureRandom;

//A classe Craps simula o jogo de dados craps
public class Craps {

	// cria um gerador de seguro de números aleatórios para uso no método rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// tipo enum com constantes que representam o estado do jogo
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constantes que representam lançamentos comuns dos dados
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		
		int myPoint = 0; //pontos se não ganhar ou perder na 1ª rodada
		Status gameStatus; //pode conter CONTINUE, WON ou LOST
		
		int sumOfDice = rollDice();//primeira rolagem dos dados
		
		//determina o estado do jogo e a pontuação com base no primeiro lançamento
		switch(sumOfDice) {
		case SEVEN://ganha com 7 no primeiro lançamento
		case YO_LEVEN: //ganha com 11 no primeiro lançamento
			gameStatus = Status.WON;
			break;
		case SNAKE_EYES: //perde com 2 no primeiro lançamento
		case TREY:	//perde com 3 no primeiro lançamento
		case BOX_CARS: //perde com 12 no primeiro lançamento
			gameStatus = Status.LOST;
			break;
		default: //não ganhou nem perdeu
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			System.out.printf("Point is %d%n", myPoint);
			break;
		}
		
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			//determina o estado do jogo
			if (sumOfDice == myPoint)//vitória por pontuação 
			{
				gameStatus = Status.WON;
			}else if (sumOfDice == SEVEN)//PERDE OBTENDO 7 ANTES DE ATINGIR A PONTUAÇÃO 
			{
				gameStatus = Status.LOST;
			}
		}
		
		//exibe uma mensagem ganhou ou perdeu
		if (gameStatus == Status.WON) {
			System.out.println("Player wins");
		}else {
			System.out.println("Player loses");
		}
		
	}
	
	public static int rollDice()
	{
		//seleciona valores aleatórios do dado
		int die1 = 1 + randomNumbers.nextInt(6);//primeiro lançamento do dado
		int die2 = 1 + randomNumbers.nextInt(6);//segundo lançamento do dado
	
		int sum = die1 + die2;//soma dos valores dos dados
		
		//exibe os resultados desse lançamento
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
		
		return sum;
	}

}//fim da classe Craps
