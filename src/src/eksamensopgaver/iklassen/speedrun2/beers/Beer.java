package eksamensopgaver.iklassen.speedrun2.beers;

import java.util.ArrayList;

// 09:50 remaining

public class Beer {
    private String name;
    private double alcoholPercentage;
    private int price;

    public Beer(String name, double alcoholPercentage, int price) throws Exception {
        this.name = name;
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
    }

    public String getName() {
        return name;
    }
    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }
    public int getPrice() {
        return price;
    }

    public void setAlcoholPercentage(double alcoholPercentage) throws Exception{
        if (alcoholPercentage >= 0 && alcoholPercentage < 100) {
            this.alcoholPercentage = alcoholPercentage;
        } else {
            throw new Exception("Alcohol percentage must be between 0-100.");
        }
    }

    public void setPrice(int price) throws  Exception {
        if (price < 0) {
            throw new Exception("Price must be above 0.");
        } else {
            this.price = price;
        }
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Beer> beers = new ArrayList<>();

        beers.add(new Beer("Tuborg", 4.0, 59));
        beers.add(new Beer("Carlsberg", 4.2, 79));
        beers.add(new Beer("Odense Pilsner", 5.0, 129));

        int total = 0;
        for (Beer beer : beers) {
            total += beer.getPrice();
        }

        System.out.println("Average price: " + total / beers.size());
    }
}
