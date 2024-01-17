package eksamensopgaver.chatGPT.zooanimals;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void printDetails() {
        for (Animal animal : animals) {
            if (animal instanceof Mammal mammal) {
                System.out.println(mammal.getName() + ", " + mammal.getHabitat() + ", " + mammal.getSpecies() + ", " + mammal.getFurColor());
            } else if (animal instanceof Bird bird) {
                System.out.println(bird.getName() + ", " + bird.getHabitat() + ", " + bird.getSpecies() + ", " + bird.getWingSpan());
            }
        }
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }
}
