package eksamensopgaver.iklassen.beers;

public class Beer {
    private String name;
    private int price;
    private double alcoholPercentage;

    public Beer(String name, int price, double alcoholPercentage) {
        setName(name);
        setPrice(price);
        setAlcoholPercentage(alcoholPercentage);
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new IllegalArgumentException("Input must be between 0-100");
        } else {
            this.alcoholPercentage = alcoholPercentage;
        }
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Input must be between 0-100");
        } else {
            this.price = price;
        }
    }

    public void setName(String name) {
        this.name = name;
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
}
