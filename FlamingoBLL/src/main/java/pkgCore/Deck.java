package pkgCore;
import java.util.*;
import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	//	TODO: Add 'cards' attribute that is an ArrayList of Card
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	//	TODO: Add a constructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).

	public void createDeck(eSuit eSuit) {
		Card c;
		cards.add(c = new Card(eSuit, eRank.TWO));
		cards.add(c = new Card(eSuit, eRank.THREE));
		cards.add(c = new Card(eSuit, eRank.FOUR));
		cards.add(c = new Card(eSuit, eRank.FIVE));
		cards.add(c = new Card(eSuit, eRank.SIX));
		cards.add(c = new Card(eSuit, eRank.SEVEN));
		cards.add(c = new Card(eSuit, eRank.EIGHT));
		cards.add(c = new Card(eSuit, eRank.NINE));
		cards.add(c = new Card(eSuit, eRank.TEN));
		cards.add(c = new Card(eSuit, eRank.JACK));
		cards.add(c = new Card(eSuit, eRank.QUEEN));
		cards.add(c = new Card(eSuit, eRank.KING));
		cards.add(c = new Card(eSuit, eRank.ACE));
		
	}
	
	public Deck(int numOfDecks) {
			for(int i = 0; i < numOfDecks; i++)
			{
				this.createDeck(eSuit.DIAMONDS);
				this.createDeck(eSuit.CLUBS);
				this.createDeck(eSuit.HEARTS);
				this.createDeck(eSuit.SPADES);
			}
		}
	
	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc

	
	//			Deck(2) will create an array of 104 cards.

	
	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
	public Card draw() {
		int cardPos = (int)(Math.random()* cards.size());
		return cards.get(cardPos);
	}
	public int getDeckSize() {
		return cards.size();
	}
	
}
