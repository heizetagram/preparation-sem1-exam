package eksamensopgaver.iklassen.speedrun.athletes;

public class ProfessionalAthlete extends Athlete {
    private int numberOfWins;

    public ProfessionalAthlete(String name, boolean isActive, int numberOfWins) {
        super(name, isActive);
        this.numberOfWins = numberOfWins;
    }

    public void setNumberOfWins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }
}
