package sorting.comparableSimple.myguineapigs;

public class GuineaPig implements Comparable<GuineaPig> {
    private static SortCriteria sortCriteria;
    private String name;
    private String race;
    private String gramsOfFood;

    public GuineaPig(String name, String race, String gramsOfFood) {
        setName(name);
        setRace(race);
        setGramsOfFood(gramsOfFood);
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getRace() {
        return race;
    }
    public String getGramsOfFood() {
        return gramsOfFood;
    }
    public static SortCriteria getSortCriteria() {
        return sortCriteria;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setGramsOfFood(String gramsOfFood) {
        this.gramsOfFood = gramsOfFood;
    }
    public static void setSortCriteria(SortCriteria sortCriteria) {
        GuineaPig.sortCriteria = sortCriteria;
    }

    public int compareTo(GuineaPig guineaPig) {
        switch (sortCriteria) {
            case NAME -> {
                return name.compareTo(guineaPig.name);
            }
            case RACE -> {
                return race.compareTo(guineaPig.race);
            }
            case GRAMS_OF_FOOD -> {
                return gramsOfFood.compareTo(guineaPig.gramsOfFood);
            }
            default -> {
                return 0;
            }
        }
    }
 }
