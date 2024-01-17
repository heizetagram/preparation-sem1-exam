package eksamensopgaver.iklassen.speedrun2.athletes;

import java.util.ArrayList;

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
}
