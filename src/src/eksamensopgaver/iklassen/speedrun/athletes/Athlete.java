package eksamensopgaver.iklassen.speedrun.athletes;

import java.util.ArrayList;

// 07:13 remaining
public abstract class Athlete {
    private String name;
    private boolean isActive;
    private ArrayList<Integer> points;

    public Athlete(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
        points = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public boolean isActive() {
        return isActive;
    }
    public ArrayList<Integer> getPoints() {
        return points;
    }

    public static void main(String[] args) {
        ProfessionalAthlete p1 = new ProfessionalAthlete("Karsten", true, 10);
        AmateurAthlete a1 = new AmateurAthlete("Poul", false, true);

        p1.setNumberOfWins(10);
        System.out.println(p1.getNumberOfWins());
        System.out.println(p1.getName());
        p1.getPoints().add(1);
        System.out.println(p1.getPoints());

        System.out.println(a1.getHasPaidFee());
        System.out.println(a1.getName());
        System.out.println(a1.isActive());
        a1.getPoints().add(20);
        System.out.println(a1.getPoints());
    }
}
