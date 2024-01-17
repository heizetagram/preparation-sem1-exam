package eksamensopgaver.exc8;

// 7:25 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        DateAgeCalulator dateAgeCalulator = new DateAgeCalulator(22);

        dateAgeCalulator.calculateLowestAge();
        System.out.println(dateAgeCalulator.isLegal());
    }
}
