/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;


import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author jtr110
 */
public class Deck {
    private final ArrayList<Card> deck;

    public Deck()
    {
        deck = new ArrayList<>();

        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
            {
                deck.add(new Card(a,b));
            }
        }  
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
