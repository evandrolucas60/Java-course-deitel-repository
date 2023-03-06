import java.security.SecureRandom;

public class DeckOfCards {
	private Card[] deck;//array de objetos card
	private int currentCard;//indice da pr�xima Card a ser distribuida (0-51)
	private static final int NUMBER_OF_CARDS = 52;//n�mero constante de Cards
	
	//gerador aleatorio
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	//construtor preenche baralho de cartas
	public DeckOfCards() {
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", 
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[NUMBER_OF_CARDS]; //cria o array de objetos Cards
		currentCard = 0;//primeira card distribuida vai ser o deck[0]
		
		//preencher o baralho com objetos Card
		for(int count = 0; count < deck.length; count++) {
			deck[count] = 
					new Card(faces[count % 13], suits[count/13]);
		}
	}
	
	//embaralha as cartas com um algoritmo de uma passagem
	public void shuffle() {
		
		//a pr�xima chamada para o m�todo dealCard deve come�ara no deck[0] novamente
		currentCard = 0;
		
		// para cada Card, seleciona outra Card aleat�ria (0-51) e as compara
		for (int first = 0; first < deck.length; first++) {
			//seleciona um n�mero aleat�rio entre 0 e 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// compara Card atual com Card aleatoriamente selecionada
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second]= temp;
		}
		
	}
	
	//distribui uma Card
	public Card dealCard() {
		// determina se ainda h� Cards a serem distribu�das
		if (currentCard < deck.length) {
			return deck[currentCard++];// retorna Card atual no array
		}else {
			return null; // retorna nulo para indicar que todos as Cards foram distribu�das
		}
	}
}
