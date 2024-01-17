package eksamensopgaver.iklassen.hogwartsstudents;

import javax.management.relation.InvalidRoleValueException;

public class HogwartsStudent implements Comparable<HogwartsStudent>{
    public String firstName;
    public String lastName;
    public House house;

    public HogwartsStudent(String firstName, String lastName, House house) throws InvalidRoleValueException {
        setFirstName(firstName);
        setLastName(lastName);
        setHouse(house);
    }

    public void setHouse(House house) throws InvalidRoleValueException {
        if (!house.equals(House.GRYFFINDOR) && !house.equals(House.RAVENCLAW) && !house.equals(House.HUFFLEPUFF) && !house.equals(House.SLYTHERIN)) {
            throw new InvalidRoleValueException("House must be either GRYFFINDOR, RAVENCLAW, HUFFLEPUFF, or SLYTHERIN.");
        } else {
            this.house = house;
        }
    }

    public int compareTo(HogwartsStudent hs) {
        return lastName.compareTo(hs.lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public House getHouse() {
        return house;
    }
}
