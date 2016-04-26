//Using objects and classes, design a deck of cards that can be used for different card game applications.

//Answer:

class Card implements Comparable{

	value: int; //Value=12
	suit:String //Suit=Spade
	//constructor
	Card()
	{
		this.value=0;
		this.suit = “”;
	}
	Card(int value, String suit)
	{
		this.value=value;
		this.suit = suit;
	}
	//Accessor methods
	public Int getValue() 
	{
		return value;
	}
	public String gerSuit()
	{
		return suit;
	}
	
	public int compareTo(Object obj)
	{
		Card other = (Card)obj;
		int thisValue = this.getValue();
		int otherValue = other.getValue();
		
		// Giving higher value to ace
		if (thisValue == 1) thisValue = 14;
		if (otherValue == 1) otherValue = 14;
		return thisValue - otherValue;
	}
	public boolean equals(Object obj)
	{
		if (obj instanceof Card)
		{
			Card other = (Card)obj;
			return this.suit==other.suit && this.value==other.value;
		}
		else return false;
	}
}			

class CardDeck
{
	CardDeck()
	{
		deck = new Card [52];
		int i = 0;
		for (int value = 1; value <= 13; ++value)
		for (int suit = 1; suit <= 4; ++suit)
		{
			deck[i] = new Card(value, suit);
			++i;
		}
		totalCards = 52;
	}
	void shuffle()
	{
		for (int next = 0; next < totalCards-1; next++)
		{
			int v = (int)((totalCards-low)*Math.random()+low);
			Card temp = deck[next];
			deck[next] = deck[v];
			deck[v] = temp;
		}
	}
	Card deal()
	{
		if (totalCards == 0) return null;
		totalCards--;
		return deck[totalCards];
	}
	int getSize()
	{
		return totalCards;
	}
}