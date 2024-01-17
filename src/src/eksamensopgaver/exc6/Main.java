package eksamensopgaver.exc6;

// 5:40 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Trailer t1 = new Trailer(1000);
        Bil c1 = new Bil(2500);
        Bil c2 = new Bil(2600);

        c1.totalWeight();
        c1.addTrailer(t1);
        c1.totalWeight();
        System.out.println(c1.getTrailer());

        System.out.println();
        c2.totalWeight();
        c2.addTrailer(t1);
        c2.totalWeight();
        System.out.println(c2.getTrailer());
    }
}
