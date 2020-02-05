/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author nasre
 */
public class CardHand {
    private int handSize = 60;
	public Card[] cards = new Card[handSize];// array of object declaration
        //Generate 60 cards and store in the array

	
        /**
         * Add comments during class to explain what this method does.
         */
        public void generateHand()
        {
                int countCards = 0;
		for(Card.Color s: Card.Color.values()) //read color value from enum Color
                {
                    for(Card.Value v: Card.Value.values())// read value from enum value
                    {
                        cards[countCards] = (new Card(s,v));//constructor
                        countCards++;
                    }
                }//end outter for
        }//end method

}
    

