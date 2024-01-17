package eksamensopgaver.chatGPT.zooanimals;

public class Bird extends Animal {
    private int wingSpan;

    public Bird(String name, String species, Habitat habitat, int wingSpan) {
        super(name, species, habitat);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }
}
