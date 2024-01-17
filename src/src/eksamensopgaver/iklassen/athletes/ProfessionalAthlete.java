package eksamensopgaver.iklassen.athletes;

public class ProfessionalAthlete extends Athlete {
    public ProfessionalAthlete(String name, boolean isActive) {
        super(name, isActive);
    }

    public int getNumberOfWins() {
        return super.getWins().size();
    }
}
