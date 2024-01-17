package eksamensopgaver.iklassen.speedrun2.hogwartsstudents.comparatortest;

import java.util.ArrayList;

public class HogwartsStudent2 {
    private String firstName;
    private String lastName;
    private String house;
    private int birthyear;

    public HogwartsStudent2(String firstName, String lastName, String house, int birthyear) throws Exception{
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthyear = birthyear;
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
    public int getBirthyear() {
        return birthyear;
    }

    private void setHouse(String house) throws Exception {
        if (house.equals("Gryffindor") || house.equals("Slytherin")  || house.equals("Hufflepuff") || house.equals("Ravenclaw")) {
            this.house = house;
        } else {
            throw new Exception("House must be either Gryffindor, Slytherin, Hufflepuff, or Ravenclaw.");
        }
    }

    public static void main(String[] args) throws Exception{
        ArrayList<HogwartsStudent2> hogwartsStudents = new ArrayList<>();

        hogwartsStudents.add(new HogwartsStudent2("Cim", "Sunge", "Hufflepuff", 2001));
        hogwartsStudents.add(new HogwartsStudent2("David", "Lu", "Ravenclaw", 1924));
        hogwartsStudents.add(new HogwartsStudent2("Draco", "Malfoy", "Slytherin", 1999));
        hogwartsStudents.add(new HogwartsStudent2("Harry", "Potter", "Gryffindor", 2010));

        System.out.println("Before sorting:");
        HogwartsStudent2.printStudents(hogwartsStudents);

        System.out.println();
        LastNameComparator lastNameComparator = new LastNameComparator();
        hogwartsStudents.sort(lastNameComparator);

        System.out.println("After sorting last name:");
        HogwartsStudent2.printStudents(hogwartsStudents);

        System.out.println();
        FirstNameComparator firstNameComparator = new FirstNameComparator();
        hogwartsStudents.sort(firstNameComparator);
        System.out.println("After sorting first name:");
        HogwartsStudent2.printStudents(hogwartsStudents);

        System.out.println();
        HouseComparator houseComparator = new HouseComparator();
        hogwartsStudents.sort(houseComparator);
        System.out.println("After sorting house:");
        HogwartsStudent2.printStudents(hogwartsStudents);

        System.out.println();
        BirthyearComparator birthyearComparator = new BirthyearComparator();
        hogwartsStudents.sort(birthyearComparator);
        System.out.println("After sorting birth year:");
        HogwartsStudent2.printStudents(hogwartsStudents);

    }

    public static void printStudents(ArrayList<HogwartsStudent2> hogwartsStudents) {
        for (HogwartsStudent2 hogwartsStudent : hogwartsStudents) {
            System.out.println(hogwartsStudent.getLastName() + ", " + hogwartsStudent.getFirstName() + ", " + hogwartsStudent.getHouse() + ", " + hogwartsStudent.getBirthyear());
        }
    }
}
