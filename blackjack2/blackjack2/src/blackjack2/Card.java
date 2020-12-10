package blackjack2;

public class Card {
	public char color;
	public int value;

	public Card(int c, int v) {
		this.value = v;
		switch (c) {
		case 0:
			this.color = 'H';
			break;
		case 1:
			this.color = 'D';
			break;
		case 2:
			this.color = 'S';
			break;
		case 3:
			this.color = 'C';
			break;

		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "" + this.color + this.value;
	}

}
