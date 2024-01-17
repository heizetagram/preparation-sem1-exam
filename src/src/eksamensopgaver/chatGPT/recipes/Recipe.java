package eksamensopgaver.chatGPT.recipes;

import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<String> ingredients;
    private String instructions;

    public Recipe(String name, String instructions) {
        this.name = name;
        this.instructions = instructions;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }
    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    public String getInstructions() {
        return instructions;
    }

}
