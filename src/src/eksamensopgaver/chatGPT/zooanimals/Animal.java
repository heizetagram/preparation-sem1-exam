package eksamensopgaver.chatGPT.zooanimals;

public abstract class Animal {
    private String name;
    private String species;
    private Habitat habitat;

    public Animal(String name, String species, Habitat habitat) {
        this.name = name;
        this.species = species;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }
    public String getSpecies() {
        return species;
    }
    public Habitat getHabitat() {
        return habitat;
    }
}
