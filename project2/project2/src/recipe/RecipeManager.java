package recipe;

import java.util.HashMap;
import java.util.Map;

public class RecipeManager {
    private Map<String, Recipe> recipes;

    public RecipeManager() {
        this.recipes = new HashMap<>();
    }

    public boolean addRecipe(Recipe recipe) {
        if (recipes.containsKey(recipe.getName())) {
            return false; // Recipe already exists
        }
        recipes.put(recipe.getName(), recipe);
        return true;
    }

    public boolean updateRecipe(String name, String newIngredients, String newInstructions) {
        Recipe recipe = recipes.get(name);
        if (recipe == null) {
            return false; // Recipe does not exist
        }
        recipe.setIngredients(newIngredients);
        recipe.setInstructions(newInstructions);
        return true;
    }

    public boolean removeRecipe(String name) {
        if (recipes.remove(name) == null) {
            return false; // Recipe does not exist
        }
        return true;
    }

    public Map<String, Recipe> listAllRecipes() {
        return recipes;
    }
}

