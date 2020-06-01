package br.maua.models;

import java.util.ArrayList;
import java.util.List;

public class PicturePokerDeck {
    private List<PicturePokerCard> deckList;

    public PicturePokerDeck() {
        this.deckList = createNewDeck();
    }

    private List<PicturePokerCard> createNewDeck(){
        List<PicturePokerCard> newDeck =  new ArrayList<>();
        newDeck.add(new PicturePokerCard(PicturePokerCardValues.CLOUD, 1));
        newDeck.add(new PicturePokerCard(PicturePokerCardValues.CLOUD, 1));
        newDeck.add(new PicturePokerCard(PicturePokerCardValues.CLOUD, 1));

        return newDeck;
    }
}
