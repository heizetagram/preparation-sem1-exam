package eksamensopgaver.exc5;

public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        setSuit(suit);
        setValue(value);
    }

    public void beats(Card card) {
        if (card.value > value || card.suit.getSuitValue() > suit.getSuitValue()) {
            System.out.println(card.value + " of " + card.getSuit() + " beats " + value + " of " + suit);
        } else if (value > card.value || suit.getSuitValue() > card.suit.getSuitValue()) {
            System.out.println(value + " of " + suit + " beats " + card.value + " of " + card.suit);
        } else
            System.out.println("Cards have the same value");
    }

    public void setValue(int value) {
        if (value > 0 && value < 14) {
             this.value = value;
        } else {
            System.out.println("Value must be between 1-13");
        }
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
}
