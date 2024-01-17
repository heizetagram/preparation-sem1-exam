package emiliaseksamen7;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private void run() throws Exception{
        Student student = new Student("Hej");

        student.addGrade("02");
        student.addGrade("4");
        student.addGrade("7");

        student.printEksamensBevis();
    }
}
