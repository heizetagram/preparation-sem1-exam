package eksamensopgaver.iklassen.athletes;

public class AmateurAthlete extends Athlete {
    private boolean hasPaidFee;

    public AmateurAthlete(String name, boolean isActive, boolean hasPaidFee) {
        super(name, isActive);
        setHasPaidFee(hasPaidFee);
    }

    public void setHasPaidFee(boolean hasPaidFee) {
        this.hasPaidFee = hasPaidFee;
    }
    public boolean hasPaidFee() {
        return hasPaidFee;
    }
}
