package eksamensopgaver.iklassen.athletes;

// 00:50 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ProfessionalAthlete pr1 = new ProfessionalAthlete("Antony", true);

        pr1.getWins().add(1);
        pr1.getWins().add(1);
        System.out.println(pr1.getNumberOfWins());

        AmateurAthlete am1 = new AmateurAthlete("Lasse", true, false);
        System.out.println(am1.hasPaidFee());
    }
}
