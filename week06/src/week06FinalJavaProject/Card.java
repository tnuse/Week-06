package week06FinalJavaProject;

public class Card {

//	A.     Fields
//  	1.     value (contains a value from 2-14 representing cards 2-Ace)
//  	2.     name (e.g. Ace of Diamonds, or Two of Hearts)
//		
	int value;
	String name;
	
	
	// Constructor to build the card
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
		
//	B.    Methods
//      1.     Getters and Setters
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//      2.     describe (prints out information about a card)
//
	public void describe() {
		System.out.println(this.name + " - " + this.value);
	}


}
