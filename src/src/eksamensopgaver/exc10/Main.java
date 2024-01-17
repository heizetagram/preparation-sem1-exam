package eksamensopgaver.exc10;

// 04:04 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        BMI bmi = new BMI(1.8, 70);

        System.out.println(bmi.isUnderWeight());
        System.out.println(bmi.isOverWeight());
        System.out.println(bmi.isNormalWeight());
    }
}
