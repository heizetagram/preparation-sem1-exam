package sorting.comparatorAdvanced;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student firstStudent, Student secondStudent) {
        return Integer.compare(firstStudent.getAge(), secondStudent.getAge());
    }
}
