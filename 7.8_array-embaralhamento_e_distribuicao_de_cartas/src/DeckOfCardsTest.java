
public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle(); // coloca Cards em ordem aleat�ria
		
		
		// imprime todas as 52 cartas na ordem em que elas s�o distribu�das
		for (int i = 1; i <= 52; i ++) {
			
			//distribui e exibe uma card
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			// gera uma nova linha ap�s cada quarta carta
			if(i % 4 == 0) {
				System.out.println();
			}
		}
	}

}//fim da classe DeckOfCardsTest
