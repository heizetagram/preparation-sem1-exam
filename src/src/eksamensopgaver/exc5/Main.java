package eksamensopgaver.exc5;

// 14 seconds remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Card c1 = new Card(Suit.HEARTS, 10);
        Card c2 = new Card(Suit.DIAMONDS, 10);
        Card c3 = new Card(Suit.DIAMONDS, 10);
        Card c4 = new Card(Suit.SPADES, 13);

        c1.beats(c2);
        c2.beats(c1);
        c2.beats(c3);
        c4.beats(c2);
    }
}
