package emiliaseksamen7;

public class Student {
    private String name;
    private String[] grades;

    public Student(String name) {
        this.name = name;
        grades = new String[5];
    }

    public String getName() {
        return name;
    }

    public void addGrade(String grade) throws Exception {
        boolean running = true;

        if (!grade.equals("-3") && !grade.equals("00") && !grade.equals("02") && !grade.equals("4") && !grade.equals("7") && !grade.equals("10") && !grade.equals("12")) {
            throw new Exception("Karakterer skal være 7-trinsskalaen.");
        } else {
            for (int i = 0; i < grades.length; i++) {
                if (grades[i] == null && running) {
                    grades[i] = grade;
                    running = false;
                }
            }
            if (running) {
                System.out.println("Grades are maxed out");
            }
        }
    }

    public void printEksamensBevis() {
        System.out.println("Student: " + name);
        System.out.print("Grades: ");
        for (String grade : grades) {
            if (grade != null) {
                System.out.print(grade + ", ");
            }
        }
        System.out.print("\nAverage grade: ");
        System.out.println(calculateAverage());
    }

    private double calculateAverage() {
        double total = 0;

        for (String grade : grades) {
            if (grade != null) {
                total += Double.parseDouble(grade);
            }
        }
        return total / getActualGradesLength();
    }

    private int getActualGradesLength() {
        int actuallength = 0;
        for (String grade : grades) {
            if (grade != null) {
                actuallength++;
            }
        }
        return actuallength;
    }
}
