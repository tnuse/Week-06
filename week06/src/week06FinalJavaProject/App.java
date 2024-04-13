package week06FinalJavaProject;

public class App {

	public static void main(String[] args) {

		
		
// 	required name input for Player Class, creating 2 separate Players
		Player playerOne = new Player("Joe");
		Player playerTwo = new Player("Sally");

// Creating a new deck and shuffling.
		Deck deck = new Deck();
		deck.shuffle();
		

// Print out all cards in the deck
		System.out.println("The current Deck is:\n----------------------\n\n");
		deck.describe();
		System.out.println("\n----------------------\n\n");

// for Loop used to create a hand for each player and print out each players hand
		for (int i = 1; i <= 26; i++) {
			playerOne.hand.add(deck.draw());
			playerTwo.hand.add(deck.draw());
			
		}
		playerOne.describe();
		System.out.println("\n-----------------------\n\n");
		
		playerTwo.describe();
		System.out.println("\n-----------------------\n\n");
	
		
		
// for Loop to play the game, print out the cards each player drew for each hand, and display who won each hand.
		for (int i = 0; i < 26; i++) {
			Card playerOneCard = playerOne.flip();
			Card playerTwoCard = playerTwo.flip();
			if (playerOneCard.getValue() > playerTwoCard.getValue()) {
				playerOne.incrementScore();
				System.out.println(playerOne.name + "'s card: " + playerOneCard.name);
				System.out.println(playerTwo.name + "'s card: " + playerTwoCard.name);
				System.out.println(playerOne.name + " Wins this hand!\n");
			} else if (playerTwoCard.getValue() > playerOneCard.getValue()) {
				playerTwo.incrementScore();
				System.out.println(playerOne.name + "'s card: " + playerOneCard.name);
				System.out.println(playerTwo.name + "'s card: " + playerTwoCard.name);
				System.out.println(playerTwo.name + " Wins this hand!\n");
			}
			
		}

// Using each player's score at the end of the game to print out which player won the game and what each players final score was
		if (playerOne.score > playerTwo.score) {
			System.out.println(playerOne.name + "Wins the game!");
			System.out.println("The final score is:\n" + playerOne.name + ": " + playerOne.score + "\n" + playerTwo.name + ": " + playerTwo.score);
			
		} else if (playerTwo.score > playerOne.score) {
			System.out.println(playerTwo.name + "Wins the game!");
			System.out.println("The final score is:\n" + playerTwo.name + ": " + playerTwo.score + "\n" + playerOne.name + ": " + playerOne.score);
			
		} else if (playerTwo.score == playerOne.score) {
			System.out.println("It's a tie!");
			System.out.println("The final score is:\n" + playerOne.name + ": " + playerOne.score + "\n" + playerTwo.name + ": " + playerTwo.score);
		}
}
}