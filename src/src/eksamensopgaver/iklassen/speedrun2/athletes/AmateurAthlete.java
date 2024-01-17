package eksamensopgaver.iklassen.speedrun2.athletes;

// 09:55 remaining

public class AmateurAthlete extends Athlete {
    private boolean hasPaidFee;

    public AmateurAthlete(String name, boolean isActive, boolean hasPaidFee) {
        super(name, isActive);
        this.hasPaidFee = hasPaidFee;
    }

    public boolean hasPaidFee() {
        return hasPaidFee;
    }

    public static void main(String[] args) {
        ProfessionalAthlete pa = new ProfessionalAthlete("Lebron", true, 10);
        AmateurAthlete aa = new AmateurAthlete("James", false, true);


        System.out.println(pa.getNumberOfWins());
        System.out.println(aa.hasPaidFee());
    }
}
