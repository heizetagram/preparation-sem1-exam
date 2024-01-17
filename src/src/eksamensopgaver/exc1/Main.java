package eksamensopgaver.exc1;

// 07:37 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Tekst t1 = new Tekst();
        t1.tilføj("hej");
        t1.tilføj("halløj");
        t1.tilføj("hej");
        t1.tilføj("hej");
        t1.tilføj("hi");

        System.out.println(t1.findAntalUnikke());
    }
}
