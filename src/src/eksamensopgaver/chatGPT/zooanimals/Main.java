package eksamensopgaver.chatGPT.zooanimals;

// 04:23 remaining

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Zoo zoo = new Zoo();

        zoo.getAnimals().add(new Mammal("Dan", "Dog", Habitat.WOODLANDS, "Brown"));
        zoo.getAnimals().add(new Mammal("Lasse", "Cat", Habitat.WOODLANDS, "Brown"));
        zoo.getAnimals().add(new Mammal("Dan", "Dog", Habitat.WOODLANDS, "Brown"));
        zoo.getAnimals().add(new Bird("David", "Blackbird", Habitat.JUNGLE, 23));
        zoo.getAnimals().add(new Bird("Fred", "Blackbird", Habitat.JUNGLE, 24));
        zoo.getAnimals().add(new Bird("Luke", "Blackbird", Habitat.JUNGLE, 25));

        zoo.printDetails();
    }
}
