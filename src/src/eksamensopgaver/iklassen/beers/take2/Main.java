package eksamensopgaver.iklassen.beers.take2;

import java.util.ArrayList;

// 08:26 remaining

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private void run() throws Exception {
        ArrayList<Beer> beers = new ArrayList<>();
        beers.add(new Beer("Carlsberg", 4.0, 49));
        beers.add(new Beer("Tuborg", 4.3, 59));
        beers.add(new Beer("Odense Pilsner", 4.4, 69));
        beers.add(new Beer("Mikkeller", 5, 39));
        beers.add(new Beer("Anton", 4, 39));
        beers.add(new Beer("Jojo", 4, 29));

        double sum = 0;
        for (Beer beer : beers) {
            sum += beer.getPrice();
        }

        System.out.println("Avg price is: " + sum / beers.size());
    }
}
