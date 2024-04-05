package staticex;

public class Quiz1 {

	public static void main(String[] args) {

	Card card1 = new Card();	
	Card card2 = new Card();	
	Card card3 = new Card();	
		
	System.out.println(card1.cardNumber);
	System.out.println(card2.cardNumber);
	System.out.println(card3.cardNumber);
	}

}

class Card { 
	static int Count = 0;
	int cardNumber = 100;
	
	public Card() {
		cardNumber += Count;
		Count++;
	}
}
