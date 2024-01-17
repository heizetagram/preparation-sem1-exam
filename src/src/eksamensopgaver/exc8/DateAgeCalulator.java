package eksamensopgaver.exc8;

public class DateAgeCalulator {
    private int yourAge;
    private int dateAge;

    public DateAgeCalulator(int yourAge) {
        setYourAge(yourAge);
        setDateAge();
    }

    public void setYourAge(int yourAge) {
        this.yourAge = yourAge;
    }

    private void setDateAge() {
        dateAge = yourAge / 2 + 7;
    }

    public void calculateLowestAge() {
        System.out.println("Lowest age: " + dateAge);
    }

    public boolean isLegal() {
        return dateAge >= 18;
    }
}
