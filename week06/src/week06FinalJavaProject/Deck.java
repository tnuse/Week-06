package week06FinalJavaProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

//    Deck
//    A.     Fields
//      	1.     cards (List of Card)

	List<Card> cards = new ArrayList<Card>();
		
	
	
//    B.    Methods
// Constructor to build the deck of 52 cards
	Deck () {
// String Arrays and Enhanced for Loops used to build each card
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Diamonds", "Hearts", "Spades", "Clubs"};
		
		for (String suit : suits) {
			int counter = 2;
		for (String number : names) {
			StringBuilder temp = new StringBuilder(number + " of " + suit);
			Card card = new Card(temp.toString(), counter);
			counter++;
			this.cards.add(card);
		}
		}
	}		
		
// Getters and Setters
	public List<Card> getCards(){
			return cards;
		}
		
		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
		
					
//      shuffle method to shuffle the deck(randomizes the order of the cards)
		public void shuffle() {
		Collections.shuffle(cards);
	}
	
		
//      draw method that removes and returns the top card of the Cards field
		public Card draw() {
			if (cards.isEmpty()) {
				System.out.println("No more cards!");
				return null;
			} else {
				Card drawnCard = cards.get(0);
				cards.remove(0);
				return drawnCard;
			}
			
		}
	


// Describe method to print out each card	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
		

	}
}
