package eksamensopgaver.exc5.take2;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Card c1 = new Card(Suit.HEARTS, 10);
        Card c2 = new Card(Suit.HEARTS, 9);
        Card c3 = new Card(Suit.DIAMONDS, 12);
        Card c4 = new Card(Suit.CLUBS, 13);

        c1.beats(c2);
        c2.beats(c3);
        c3.beats(c4);
        c4.beats(c1);
    }
}
