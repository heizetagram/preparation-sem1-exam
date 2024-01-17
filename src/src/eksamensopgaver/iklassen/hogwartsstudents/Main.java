package eksamensopgaver.iklassen.hogwartsstudents;

import javax.management.relation.InvalidRoleValueException;
import java.util.ArrayList;
import java.util.Collections;

// 00:07 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        try {
            HogwartsStudent h1 = new HogwartsStudent("Harry", "Potter", House.GRYFFINDOR);
            HogwartsStudent h2 = new HogwartsStudent("Dragon", "Chin", House.RAVENCLAW);
            HogwartsStudent h3 = new HogwartsStudent("Ron", "Weasley", House.GRYFFINDOR);

            ArrayList<HogwartsStudent> hogwartsStudents = new ArrayList<>();
            hogwartsStudents.add(h1);
            hogwartsStudents.add(h2);
            hogwartsStudents.add(h3);

            Collections.sort(hogwartsStudents);

            for (HogwartsStudent hogwartsStudent : hogwartsStudents) {
                System.out.println(hogwartsStudent.lastName + ", " + hogwartsStudent.getFirstName() + ", " + hogwartsStudent.getHouse());
            }


        } catch (InvalidRoleValueException e) {
            throw new RuntimeException(e);
        }
    }
}
