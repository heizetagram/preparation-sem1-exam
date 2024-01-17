package eksamensopgaver.iklassen.speedrun3.hogwartsstudents;

import java.util.ArrayList;
import java.util.Collections;

// 08:43 remaining

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) throws Exception{
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public void setHouse(String house) throws Exception {
        if (house.equals("Gryffindor") || house.equals("Hufflepuff") || house.equals("Ravenclaw") || house.equals("Slytherin")) {
            this.house = house;
        } else {
            throw new Exception("House must be either Gryffindor, Hufflepuff, Ravenclaw, or Slytherin.");
        }
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getHouse() {
        return house;
    }

    @Override
    public int compareTo(HogwartsStudent hs) {
        return lastName.compareTo(hs.lastName);
    }

    public static void main(String[] args) throws Exception {
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();

        hogwartsStudents.add(new HogwartsStudent("Harry", "Potter", "Gryffindor"));
        hogwartsStudents.add(new HogwartsStudent("Ron", "Weasley", "Gryffindor"));
        hogwartsStudents.add(new HogwartsStudent("Draco", "Malfoy", "Slytherin"));

        Collections.sort(hogwartsStudents);

        for (HogwartsStudent hogwartsStudent : hogwartsStudents) {
            System.out.println(hogwartsStudent.getFirstName() + ", " + hogwartsStudent.getLastName() + ", " + hogwartsStudent.getHouse());
        }
    }
}
