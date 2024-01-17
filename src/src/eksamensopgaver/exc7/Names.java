package eksamensopgaver.exc7;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;

    public Names(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length == 3) {
            setFirstName(parts[0]);
            setMiddleName(parts[1]);
            setLastName(parts[2]);
        } else if (parts.length == 2) {
            setFirstName(parts[0]);
            setMiddleName("");
            setLastName(parts[1]);
        }
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }
}
