/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Natha
 */
public class WarGame extends Game{
    public WarGame(String string) {
        super(string);
    }

    @Override
    public void play() {
        GroupOfCards deck = new GroupOfCards(52);
        Pile pileOne = new Pile();
        Pile pileTwo = new Pile();
        for(Suit s: Suit.values()){
            for(Rank r: Rank.values()){
                PlayingCard card = new PlayingCard(r, s);
                deck.addCard(card);
            }
        }
        deck.shuffle();
        for(int i = 0; i < deck.getSize(); i++){
            pileOne.addCard(deck.getCard(i));
            i++;
            pileTwo.addCard(deck.getCard(i));
        }
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
