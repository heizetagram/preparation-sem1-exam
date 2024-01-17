package eksamensopgaver.iklassen.speedrun2.hogwartsstudents;

import java.util.ArrayList;
import java.util.Collections;

// 07:35 remaining

public class HogwartsStudent implements Comparable<HogwartsStudent> {
    private String firstName;
    private String lastName;
    private String house;

    public HogwartsStudent(String firstName, String lastName, String house) throws Exception{
        this.firstName = firstName;
        this.lastName = lastName;
        setHouse(house);
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

    private void setHouse(String house) throws Exception {
        if (house.equals("Gryffindor") || house.equals("Slytherin")  || house.equals("Hufflepuff") || house.equals("Ravenclaw")) {
            this.house = house;
        } else {
            throw new Exception("House must be either Gryffindor, Slytherin, Hufflepuff, or Ravenclaw.");
        }
    }

    @Override
    public int compareTo(HogwartsStudent hs) {
        return lastName.compareTo(hs.lastName);
    }

    public static void main(String[] args) throws Exception{
        ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();

        hogwartsStudents.add(new HogwartsStudent("Cim", "Sunge", "Hufflepuff"));
        hogwartsStudents.add(new HogwartsStudent("David", "Lu", "Ravenclaw"));
        hogwartsStudents.add(new HogwartsStudent("Draco", "Malfoy", "Slytherin"));
        hogwartsStudents.add(new HogwartsStudent("Harry", "Potter", "Gryffindor"));

        System.out.println("Before sorting:");
        HogwartsStudent.printStudents(hogwartsStudents);

        System.out.println();
        Collections.sort(hogwartsStudents);
        System.out.println("After sorting:");
        HogwartsStudent.printStudents(hogwartsStudents);

    }

    public static void printStudents(ArrayList<HogwartsStudent> hogwartsStudents) {
        for (HogwartsStudent hogwartsStudent : hogwartsStudents) {
            System.out.println(hogwartsStudent.getLastName() + ", " + hogwartsStudent.getFirstName() + ", " + hogwartsStudent.getHouse());
        }
    }
}
