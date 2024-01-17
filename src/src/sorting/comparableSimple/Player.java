package sorting.comparableSimple;

public class Player implements Comparable<Player> {
    private String name;
    private Integer age;
    private int ranking;
    private static SortCriteria sortCriteria;

    public Player(String name, int age, int ranking) {
        setName(name);
        setAge(age);
        setRanking(ranking);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getRanking() {
        return ranking;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public enum SortCriteria {
        NAME,
        AGE,
        RANKING
    }

    public static void setSortCriteria(SortCriteria sortCriteria) {
        Player.sortCriteria = sortCriteria;
    }

    public static SortCriteria getSortCriteria() {
        return sortCriteria;
    }

    public int compareTo(Player p) {
        switch (sortCriteria) {
            case NAME -> {
                // Iterate through the given list, and compare
                return name.compareTo(p.name);
            }
            case AGE -> {
                // return (age - p.age);
                // If you use an Integer wrapper class, you are able to use compareTo(), seen above with String name
                return (age.compareTo(p.age));
            }
            case RANKING -> {
                // Changing the position of 'p.ranking' and 'ranking' will determine which order it gets sorted
                // p.ranking - ranking gives a descending order
                return p.ranking - ranking;
            }
            default -> {
                return 0;
            }
        }
    }
}
