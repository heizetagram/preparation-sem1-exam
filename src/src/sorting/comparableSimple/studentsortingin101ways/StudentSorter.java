package sorting.comparableSimple.studentsortingin101ways;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorter {
    private Student s1;
    private Student s2;
    private Student s3;
    private Student s4;
    private Student s5;
    private Student s6;
    private Student s7;
    private Student s8;
    private Student s9;
    private Student s10;
    private Student s11;
    private Student s12;
    private Student s13;
    private Student s14;
    private Student s15;
    private Student s16;
    private Student s17;
    private Student s18;
    private Student s19;
    private Student s20;
    private Student s21;
    private Student s22;
    private Student s23;
    private Student s24;
    private Student s25;
    private Student s26;
    private Student s27;
    private Student s28;
    private Student s29;
    private Student s30;
    private Student s31;
    private Student s32;
    private Student s33;
    private Student s34;
    private Student s35;
    private Student s36;
    private Student s37;
    private Student s38;
    private Student s39;
    private Student s40;
    private Student s41;
    private Student s42;
    private Student s43;
    private Student s44;
    private Student s45;
    private Student s46;
    private Student s47;

    public static void main(String[] args) {
        new StudentSorter().run();
    }

    private void run() {
        ArrayList<Student> students = new ArrayList<>();

        initStudents();
        addStudentToStudents(students);

        System.out.println("Name:");
        Student.setSortCriteria(Student.SortCriteria.NAME);
        Collections.sort(students);
        printStudents(students);

        System.out.println("\nZip code:");
        Student.setSortCriteria(Student.SortCriteria.ZIP_CODE);
        Collections.sort(students);
        printStudents(students);

        System.out.println("\nLiving with parents:");
        Student.setSortCriteria(Student.SortCriteria.LIVING_WITH_PARENTS);
        Collections.sort(students);
        printStudents(students);

        System.out.println("\nGender:");
        Student.setSortCriteria(Student.SortCriteria.GENDER);
        Collections.sort(students);
        printStudents(students);

    }

    private void printStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void initStudents() {
        s1 = new Student("Lars", 2500, false, 'M');
        s2 = new Student("Louise",  5000, true, 'F');
        s3 = new Student("Mikkel", 2600, true, 'M');
        s4 = new Student("Emma", 3000, false, 'F');
        s5 = new Student("Daniel", 4500, true, 'M');
        s6 = new Student("Isabella", 2800, true, 'F');
        s7 = new Student("William", 3200, false, 'M');
        s8 = new Student("Olivia", 4800, true, 'F');
        s9 = new Student("James", 2700, true, 'M');
        s10 = new Student("Sophia", 3500, false, 'F');
        s11 = new Student("Logan", 4200, true, 'M');
        s12 = new Student("Ava", 2900, true, 'F');
        s13 = new Student("Benjamin", 3100, false, 'M');
        s14 = new Student("Mia", 4700, true, 'F');
        s15 = new Student("Henry", 2600, true, 'M');
        s16 = new Student("Ella", 3300, false, 'F');
        s17 = new Student("Alexander", 4400, true, 'M');
        s18 = new Student("Scarlett", 3000, true, 'F');
        s19 = new Student("Liam", 3400, false, 'M');
        s20 = new Student("Charlotte", 4600, true, 'F');
        s21 = new Student("Sebastian", 3100, true, 'M');
        s22 = new Student("Amelia", 3600, false, 'F');
        s23 = new Student("Jackson", 4300, true, 'M');
        s24 = new Student("Lily", 3200, true, 'F');
        s25 = new Student("Lucas", 3700, false, 'M');
        s26 = new Student("Aria", 4500, true, 'F');
        s27 = new Student("Ethan", 2800, true, 'M');
        s28 = new Student("Harper", 3800, false, 'F');
        s29 = new Student("Carter", 4200, true, 'M');
        s30 = new Student("Grace", 2700, true, 'F');
        s31 = new Student("Aiden", 3900, false, 'M');
        s32 = new Student("Evelyn", 4400, true, 'F');
        s33 = new Student("Mason", 2900, true, 'M');
        s34 = new Student("Chloe", 4000, false, 'F');
        s35 = new Student("Elijah", 4100, true, 'M');
        s36 = new Student("Zoe", 3000, true, 'F');
        s37 = new Student("Daniel", 4100, false, 'M');
        s38 = new Student("Sofia", 4300, true, 'F');
        s39 = new Student("Liam", 3100, true, 'M');
        s40 = new Student("Madison", 4200, false, 'F');
        s41 = new Student("Aiden", 4600, true, 'M');
        s42 = new Student("Avery", 3200, true, 'F');
        s43 = new Student("Aubrey", 4300, false, 'F');
        s44 = new Student("Eli", 4800, true, 'M');
        s45 = new Student("Peyton", 3300, true, 'F');
        s46 = new Student("Brooklyn", 4400, false, 'F');
        s47 = new Student("Cameron", 4700, true, 'M');
    }

    private void addStudentToStudents(ArrayList<Student> students) {
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);
        students.add(s11);
        students.add(s12);
        students.add(s13);
        students.add(s14);
        students.add(s15);
        students.add(s16);
        students.add(s17);
        students.add(s18);
        students.add(s19);
        students.add(s20);
        students.add(s21);
        students.add(s22);
        students.add(s23);
        students.add(s24);
        students.add(s25);
        students.add(s26);
        students.add(s27);
        students.add(s28);
        students.add(s29);
        students.add(s30);
        students.add(s31);
        students.add(s32);
        students.add(s33);
        students.add(s34);
        students.add(s35);
        students.add(s36);
        students.add(s37);
        students.add(s38);
        students.add(s39);
        students.add(s40);
        students.add(s41);
        students.add(s42);
        students.add(s43);
        students.add(s44);
        students.add(s45);
        students.add(s46);
        students.add(s47);
    }
}
