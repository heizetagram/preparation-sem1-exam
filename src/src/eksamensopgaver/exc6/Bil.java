package eksamensopgaver.exc6;

public class Bil {
    private Trailer trailer;
    private double weight;

    public Bil(double weight) {
        setWeight(weight);
    }

    public void totalWeight() {
        System.out.println(weight);
    }

    public void addTrailer(Trailer trailer) {
        if (trailer.getWeight() + weight <= 3500) {
            this.trailer = trailer;
            weight += trailer.getWeight();
        } else {
            System.out.println("Total weight cannot be more than 3500");
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Trailer getTrailer() {
        return trailer;
    }
}
