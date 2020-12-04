package blackjack;

public class Deck {
	Card[] content = new Card[52];

	public Deck() {
		int j = 0;
		for (int i = 1; i < 14; i++) {
			for (int a = 0; a < 4; a++) {
				this.content[j] = new Card(a, i);
				j++;
			}
			
		}
	}

	@Override
	public String toString() {
		String result = " ";
		for (int b = 0; b < 52; b++) {
			result = result + (content[b] + ", ");
		}
		return result;
	}
}