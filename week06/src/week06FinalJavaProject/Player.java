package week06FinalJavaProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
//Player
//	A.     Fields
//      1.     hand (List of Card)
//      2.     score (set to 0 in the constructor)
//      3.     name
	int score;
	String name;
	List<Card> hand = new ArrayList<Card>();
	

	
//  Constructor to create each player
	public Player (String name) {
		this.name = name;
		this.score = 0;
	}
	

// Method to describe each player and print out their hand of cards
	public void describe() {
		System.out.println(name + " has the following cards:");
		for (Card card : hand) {
			card.describe();
		}
	}

// flip method used for each player to flip a card to play
	public Card flip() {
		Card drawnTopCard = hand.get(0);
		hand.remove(0);
			return drawnTopCard;
		
	}
	
// draw method used to create a hand of cards for each player by drawing from the deck
	public void draw (Deck deck) {
		Card card = deck.draw();
		hand.add(card);
	}
		
	 
// Method used to increment the score for which ever player wins the hand
	public void incrementScore() {
		this.score++;
	}
	
	public int getScore() {
		return score;
	}
//	B.    Methods
//        1.     describe (prints out information about the player and calls the describe method for each card in the Hand List)

	
//        2.     flip (removes and returns the top card of the Hand)
//        3.     draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//        4.     incrementScore (adds 1 to the Player’s score field)
//
//
}
