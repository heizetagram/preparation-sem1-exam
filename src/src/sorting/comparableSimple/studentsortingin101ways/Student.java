package sorting.comparableSimple.studentsortingin101ways;

public class Student implements Comparable<Student> {
    private String name;
    private int zipCode;
    private boolean livingWithParents;
    private char gender;
    public static SortCriteria sortCriteria;

    public Student(String name, int zipCode, boolean livingWithParents, char gender) {
        setName(name);
        setZipCode(zipCode);
        setLivingWithParents(livingWithParents);
        setGender(gender);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getZipCode() {
        return zipCode;
    }
    public boolean isLivingWithParents() {
        return livingWithParents;
    }
    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public void setLivingWithParents(boolean livingWithParents) {
        this.livingWithParents = livingWithParents;
    }
    public void setGender(char gender) {
        this.gender = (gender == 'M' ||  gender == 'F' ? gender : '0');
    }

    public enum SortCriteria {
        NAME,
        ZIP_CODE,
        LIVING_WITH_PARENTS,
        GENDER
    }
    public static SortCriteria getSortCriteria() {
        return sortCriteria;
    }
    public static void setSortCriteria(SortCriteria sortCriteria) {
        Student.sortCriteria = sortCriteria;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", " + zipCode +
                ", " + livingWithParents +
                ", " + gender;
    }

    public int compareTo(Student s) {
        switch (sortCriteria) {
            case NAME -> {
                return name.compareTo(s.name);
            }
            case ZIP_CODE -> {
                return Integer.compare(zipCode, s.zipCode);
            }
            case LIVING_WITH_PARENTS -> {
                return Boolean.compare(livingWithParents, s.livingWithParents);
            }
            case GENDER -> {
                return Character.compare(gender, s.gender);
            }
            default -> {
                return 0;
            }
        }
    }
}
