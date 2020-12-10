package blackjack2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

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

	public Card getCard(int i) {
		return content[i];
	}

	public static String swap(int i, int j) {
		Card a;
		Card b;
		String result = " ";
		a = content[i];
		b = content[j];
		content[j] = a;
		content[i] = b;
		result = result + content[j] + " " + content[j];
		return result;
	}

	private static Random rnd = ThreadLocalRandom.current();

	public static int getRandomNb(int max) {
		return rnd.nextInt(max);
	}

	public static int shuffle() {
		for (int i = 0; i < 51; i++) {
			int a = getRandomNb(51);
			int b = getRandomNb(51);
			swap(a, b);
		}
	return 1;
	}
}
