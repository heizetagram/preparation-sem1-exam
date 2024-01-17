package eksamensopgaver.iklassen.beers.take2;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private int price;

    public Beer(String name, double alcoholPercentage, int price) throws Exception{
        setName(name);
        setAlcoholPercentage(alcoholPercentage);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAlcoholPercentage(double alcoholPercentage) throws Exception {
        if (alcoholPercentage < 0 || alcoholPercentage > 100) {
            throw new Exception("Alcohol Percentage must be between 0-100");
        } else {
            this.alcoholPercentage = alcoholPercentage;
        }
    }
    public void setPrice(int price) throws Exception {
        if (price < 0) {
            throw new Exception("Price must be above 0");
        } else {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}
