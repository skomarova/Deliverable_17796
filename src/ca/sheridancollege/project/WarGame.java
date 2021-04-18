package ca.sheridancollege.project;

/**
 * This class implements the rules applied to the game of war
 *
 * @author Svetlana Komarova
 *
 */
public class WarGame extends Game {

    private final int DECK_SIZE = 52;

    public WarGame(String gameName) {
        super(gameName);
    }

    @Override
    public void play() {

        GroupOfCards warDeck = new GroupOfCards(DECK_SIZE);
        Pile pileOne = new Pile();
        Pile pileTwo = new Pile();

        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                PlayingCard c = new PlayingCard(r, s);
                warDeck.addCard(c);
            }
        }

        warDeck.shuffle();

        for (int i = 0; i < warDeck.getSize(); i++) {
            pileOne.addCard(warDeck.getCard(i));
            i++;
            pileTwo.addCard(warDeck.getCard(i));
        }

        PlayingCard c1 = new PlayingCard();
        PlayingCard c2 = new PlayingCard();
        
        //TODO

    }

    @Override
    public void declareWinner(int winner, int lost) {

       //TODO
    }
}
