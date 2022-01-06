package ca.sheridancollege.project;

import java.util.LinkedList;

/**
 * This class represents a pile of playing cards
 *
 * @author Svetlana Komarova - April 16, 2021
 *
 */
public class Pile {
 
    private LinkedList<PlayingCard> pile;

    // construct a pile of cards
    public Pile() {

        pile = new LinkedList();
    }
    
    // returns the size of the pile
    public int getSize() {
        return pile.size();
    }

    // appends the card to the end of the pile
    public void addCard(PlayingCard c) {
        pile.add(c);
    }

    // removes and returns the first card of the pile 
    public PlayingCard popCard() {

        return pile.pop();
    }

    // returns the card at the specified position in the pile
    public PlayingCard getCard(int i) {
        return pile.get(i);
    }

    // returns last card in the pile
    public PlayingCard getLastCard() {
        return pile.getLast();
    }
    
    // removes last card from the pile
    public PlayingCard removeLastCard() {
        return pile.removeLast();
    }

}
