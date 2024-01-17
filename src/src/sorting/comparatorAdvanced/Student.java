package sorting.comparatorAdvanced;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
    }
}
