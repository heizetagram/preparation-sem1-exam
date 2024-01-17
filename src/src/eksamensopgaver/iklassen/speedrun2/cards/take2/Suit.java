package eksamensopgaver.iklassen.speedrun2.cards.take2;

public enum Suit {
    HEARTS (4),
    DIAMONDS (3),
    CLUBS (2),
    SPADES (1);

    private final int suitValue;

    Suit(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }
}
