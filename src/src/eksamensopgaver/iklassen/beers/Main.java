package eksamensopgaver.iklassen.beers;

import java.util.ArrayList;

// 03:21 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Beer b1 = new Beer("Carlsberg", 49, 4.0);
        Beer b2 = new Beer("OP", 79, 3.0);
        Beer b3 = new Beer("Mikkeller", 65, 3.5);

        ArrayList<Beer> beers = new ArrayList<>();
        beers.add(b1);
        beers.add(b2);
        beers.add(b3);

        int sum = 0;

        for (Beer beer : beers) {
            sum += beer.getPrice();
        }

        double avg = (double) sum / beers.size();
        System.out.println(avg);
    }
}
