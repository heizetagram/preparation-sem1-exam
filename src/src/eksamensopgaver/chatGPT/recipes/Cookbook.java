package eksamensopgaver.chatGPT.recipes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Cookbook {
    private ArrayList<Recipe> recipes;

    public Cookbook() {
        recipes = new ArrayList<>();
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe getRecipeByName(String name) {
        Recipe r1 = null;
        for (Recipe recipe : recipes) {
            if (recipe.getName().equals(name)) {
                r1 = recipe;
            }
        }
        return r1;
    }

    public void saveToFile() {
        try {
            PrintStream writer = new PrintStream(new File("recipes.txt"));
            for (Recipe recipe : recipes) {
                writer.println(recipe.getName());
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file");
        }
    }
}
