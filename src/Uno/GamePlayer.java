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
public class GamePlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CardHand ch = new CardHand();
                ch.generateHand();//delegation is achieved
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getColor());
                }
               // System.out.println(ch.cards); show what happens when there is no toString()
	}
    }
    

