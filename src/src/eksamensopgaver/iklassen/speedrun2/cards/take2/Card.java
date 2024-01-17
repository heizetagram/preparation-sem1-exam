package eksamensopgaver.iklassen.speedrun2.cards.take2;

// 07:21 remaining

public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) throws Exception {
        this.suit = suit;
        setValue(value);
    }

    public void setValue(int value) throws Exception {
        if (value >= 1 && value <= 13) {
            this.value = value;
        } else {
            throw new Exception("Value must be between 1-13.");
        }
    }

    public void beats(Card card2) {
        if (suit.getSuitValue() > card2.suit.getSuitValue() || (suit.getSuitValue() > card2.suit.getSuitValue() && value > card2.value)) {
            System.out.println("My " + suit + ":" + value + " beats your " + card2.suit + ":" + card2.value);
        } else if (card2.suit.getSuitValue() > suit.getSuitValue() || (card2.suit.getSuitValue() > suit.getSuitValue() && card2.value > value)) {
            System.out.println("Your " + card2.suit + ":" + card2.value + " beats my " + suit + ":" + value);
        } else {
            System.out.println("Both cards are the same.");
        }
    }

    public static void main(String[] args) throws Exception {
        Card c1 = new Card(Suit.SPADES, 13);
        Card c2 = new Card(Suit.DIAMONDS, 2);
        Card c3 = new Card(Suit.HEARTS, 5);
        Card c4 = new Card(Suit.CLUBS, 12);
        Card c5 = new Card(Suit.CLUBS, 12);

        c1.beats(c2);
        c2.beats(c3);
        c3.beats(c4);
        c4.beats(c1);
        c4.beats(c5);
    }
}
