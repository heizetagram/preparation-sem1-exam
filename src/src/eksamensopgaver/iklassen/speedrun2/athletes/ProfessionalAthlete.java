package eksamensopgaver.iklassen.speedrun2.athletes;

public class ProfessionalAthlete extends Athlete {
    private int numberOfWins;

    public ProfessionalAthlete(String name, boolean isActive, int numberOfWins) {
        super(name, isActive);
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }
}
