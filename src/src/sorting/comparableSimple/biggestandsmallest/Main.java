package sorting.comparableSimple.biggestandsmallest;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        ArrayList<Kid> kids = new ArrayList<>();
        Kid k1 = new Kid(110, "Jakob", 2010, 9);
        Kid k2 = new Kid(90, "Simon", 2019, 1);
        Kid k3 = new Kid(120, "Mark", 2015, 5);

        kids.add(k1);
        kids.add(k2);
        kids.add(k3);

        System.out.println("Before sorting:");
        printKids(kids);

        System.out.println("\nHeight in CM:");
        Kid.setSortCriteria(Kid.SortCriteria.HEIGHT_IN_CM);
        Collections.sort(kids);
        printKids(kids);

        Kid shortestKid = new Kid(kids.getFirst().getHeightInCm(), kids.getFirst().getName(), kids.getFirst().getBirthYear(), kids.getFirst().getClassYear());
        Kid tallestKid = new Kid(kids.getLast().getHeightInCm(), kids.getLast().getName(), kids.getLast().getBirthYear(), kids.getLast().getClassYear());

        System.out.println("\nShortest: " + shortestKid.getName() + ": " + shortestKid.getHeightInCm());
        System.out.println("Tallest: " + tallestKid.getName() + ": " + tallestKid.getHeightInCm());

        System.out.println("\nName:");
        Kid.setSortCriteria(Kid.SortCriteria.NAME);
        Collections.sort(kids);
        printKids(kids);

        System.out.println("\nBirth year");
        Kid.setSortCriteria(Kid.SortCriteria.BIRTH_YEAR);
        Collections.sort(kids);
        printKids(kids);

        System.out.println("\nClass year");
        Kid.setSortCriteria(Kid.SortCriteria.CLASS_YEAR);
        Collections.sort(kids);
        printKids(kids);
    }

    private void printKids(ArrayList<Kid> kids) {
        for (Kid kid : kids) {
            System.out.println(kid.getName() + ": " + kid.getHeightInCm() + ", " + kid.getBirthYear() + ", " + kid.getClassYear());
        }
    }
}
