package eksamensopgaver.exc13;

// 07:01 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        JuleGave j1 = new JuleGave();
        JuleGave j2 = new JuleGave();

        System.out.println("J1:");
        System.out.println(j1.isSoft());
        System.out.println(j1.isRectangular());
        System.out.println(j1.doesRattle());
        System.out.println("Could be lego? " + j1.couldBeLego());

        System.out.println();
        System.out.println("J2:");
        System.out.println(j2.isSoft());
        System.out.println(j2.isRectangular());
        System.out.println(j2.doesRattle());
        System.out.println("Could be lego? " + j2.couldBeLego());

    }
}
