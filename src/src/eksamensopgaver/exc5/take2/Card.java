package eksamensopgaver.exc5.take2;

public class Card {
    private Suit suit;
    private int value;

    public Card(Suit suit, int value) {
        setSuit(suit);
        setValue(value);
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public void beats(Card card) {
        if (suit.getSuitValue() > card.getSuit().getSuitValue() || (suit.getSuitValue() == card.getSuit().getSuitValue() && value > card.getValue())) {
            System.out.println(suit + ":" + value + " beats your " + card.getSuit() + ":" + card.getValue());
        } else if (card.getSuit().getSuitValue() > getSuit().getSuitValue() || (card.getSuit().getSuitValue() == getSuit().getSuitValue() && card.getValue() > value)) {
            System.out.println(card.getSuit() + ":" + card.getValue() + " beats my " + suit + ":" + value);
        } else {
            System.out.println("Cards are equal");
        }
    }

    public Suit getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
}
