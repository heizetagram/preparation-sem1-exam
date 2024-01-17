package eksamensopgaver.exc7;

// 5:35 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Names n1 = new Names("David Lee Lu");
        Names n2 = new Names("Lars Larsen");

        System.out.println(n1);
        System.out.println(n1.getFirstName() + " " + n1.getMiddleName() + " " + n1.getLastName());

        System.out.println(n2);
        System.out.println(n2.getFirstName() + " " + n2.getMiddleName() + " " + n2.getLastName());
    }
}
