package eksamensopgaver.iklassen.speedrun.athletes;

public class AmateurAthlete extends Athlete {
    private boolean hasPaidFee;

    public AmateurAthlete(String name, boolean isActive, boolean hasPaidFee) {
        super(name, isActive);
        this.hasPaidFee = hasPaidFee;
    }

    public void setHasPaidFee(boolean hasPaidFee) {
        this.hasPaidFee = hasPaidFee;
    }
    public boolean getHasPaidFee() {
        return hasPaidFee;
    }
}
