package eksamensopgaver.iklassen.athletes;

import java.util.ArrayList;

abstract public class Athlete {
    private String name;
    private boolean isActive;
    private ArrayList<Integer> wins;

    public Athlete(String name, boolean isActive) {
        setName(name);
        setActive(isActive);
        wins = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }
    public boolean isActive() {
        return isActive;
    }
    public ArrayList<Integer> getWins() {
        return wins;
    }
}
