package sorting.comparableSimple.biggestandsmallest;

public class Kid implements Comparable<Kid> {
    private int heightInCm;
    private String name;
    private int birthYear;
    private int classYear;
    private static SortCriteria sortCriteria;

    // Constructor
    public Kid(int heightInCm, String name, int birthYear, int classYear) {
        setHeightInCm(heightInCm);
        setName(name);
        setBirthYear(birthYear);
        setClassYear(classYear);
    }

    // Getters
    public int getHeightInCm() {
        return heightInCm;
    }
    public String getName() {
        return name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public int getClassYear() {
        return classYear;
    }

    // Setters
    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public enum SortCriteria {
        NAME,
        HEIGHT_IN_CM,
        BIRTH_YEAR,
        CLASS_YEAR
    }
    public static SortCriteria getSortCriteria() {
        return sortCriteria;
    }
    public static void setSortCriteria(SortCriteria sortCriteria) {
        Kid.sortCriteria = sortCriteria;
    }

    public int compareTo(Kid k) {
        switch (sortCriteria) {
            case NAME -> {
                return name.compareTo(k.name);
            }
            case HEIGHT_IN_CM -> {
                return Integer.compare(heightInCm, k.heightInCm);
            }
            case BIRTH_YEAR -> {
                return Integer.compare(birthYear, k.birthYear);
            }
            case CLASS_YEAR -> {
                return Integer.compare(classYear, k.classYear);
            }
            default -> {
                return 0;
            }
        }
        // Alphabetical
        //return name.compareTo(k.name());

        // Height
        //return Integer.compare(heightInCm, k.heightInCm);
    }
}
