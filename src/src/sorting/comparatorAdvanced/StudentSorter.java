package sorting.comparatorAdvanced;

import java.util.ArrayList;

public class StudentSorter {
    public static void main(String[] args) {
        new StudentSorter().run();
    }

    private void run() {
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Mark", 12);
        Student s2 = new Student("Bjarne", 20);
        Student s3 = new Student("Abel", 17);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        System.out.println("Before sorting;");
        printStudents(students);

        StudentAgeComparator studentAgeComparator = new StudentAgeComparator();

        // ArrayLists uses the implementation of the List interface, which is why you have the method sort() in the ArrayList. No need to call Collections.sort().
        //Collections.sort(students, studentAgeComparator);
        students.sort(studentAgeComparator);

        System.out.println("\nAfter sorting:");
        printStudents(students);

        // Java 8
        /*Comparator<Student> byName = Comparator.comparing(Student::getName);
        students.sort(byName);
         */
    }

    // Prints all students
    private void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}
