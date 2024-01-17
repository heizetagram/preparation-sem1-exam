package eksamensopgaver.iklassen.speedrun.hogwartsstudents;

import java.util.ArrayList;
import java.util.Collections;

// 05:39  remaining

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) throws Exception {
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
    }

    public void setHouse(String house) throws Exception{
        if (house == "Gryffindor" || house == "Slytherin" || house == "Hufflepuff" || house == "Ravenclaw") {
            this.house = house;
        } else {
            throw new Exception("House must be either Gryffindor, Slytherin, Hufflepuff, or Ravenclaw");
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
        return getFirstName().compareTo(hs.getFirstName());
    }

    public static void main(String[] args) throws Exception{
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();

        hogwartsStudents.add(new HogwartsStudent("Harry", "Potter", "Gryffindor"));
        hogwartsStudents.add(new HogwartsStudent("Ron", "Weasley", "Gryffindor"));
        hogwartsStudents.add(new HogwartsStudent("Draco", "Malfoy", "Slytherin"));


        System.out.println("Before sorting:");
        HogwartsStudent.printStudents(hogwartsStudents);

        System.out.println();

        Collections.sort(hogwartsStudents);
        System.out.println("After sorting:");
        HogwartsStudent.printStudents(hogwartsStudents);
    }

    public static void printStudents(ArrayList<HogwartsStudent> hogwartsStudents) {
        for (HogwartsStudent hogwartsStudent : hogwartsStudents) {
            System.out.println(hogwartsStudent.getFirstName() + " " + hogwartsStudent.getLastName() + ", " + hogwartsStudent.getHouse());
        }
    }
}
