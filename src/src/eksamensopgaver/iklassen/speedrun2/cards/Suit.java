package eksamensopgaver.iklassen.speedrun2.cards;

public enum Suit {
    HEARTS (4),
    DIAMONDS (3),
    CLUBS (2),
    SPADES (1);

    private int suitValue;
    Suit(int suitValue) {
        this.suitValue = suitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }

}
