package ua.hillel.lesson10;

public class PokerMachine {
    private boolean deckSorted;

    public void shuffleDeck() {
        deckSorted = true;
    }

    public boolean isDeckSorted() {
        return deckSorted;
    }
}
