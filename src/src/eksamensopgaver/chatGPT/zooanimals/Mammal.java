package eksamensopgaver.chatGPT.zooanimals;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(String name, String species, Habitat habitat, String furColor) {
        super(name, species, habitat);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }
}
