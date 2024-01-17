package eksamensopgaver.chatGPT.recipes;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Cookbook cookbook = new Cookbook();

        cookbook.getRecipes().add(new Recipe("Pizza", "Bake in oven"));
        cookbook.getRecipes().add(new Recipe("Burger", "Pan"));
        cookbook.getRecipes().add(new Recipe("Sushi", "Make it by hand"));

        System.out.println(cookbook.getRecipeByName("Pizza").getName() + ", " + cookbook.getRecipeByName("Pizza").getInstructions());

        cookbook.saveToFile();
        }
        }
