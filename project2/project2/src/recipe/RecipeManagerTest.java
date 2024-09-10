package recipe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RecipeManagerTest {

    private RecipeManager recipeManager;

    @BeforeEach
    public void setUp() {
        recipeManager = new RecipeManager();
    }

    @Test
    public void testAddRecipe() {
        Recipe recipe = new Recipe("Pasta", "Pasta, Tomato Sauce", "Boil pasta, add sauce");
        boolean isAdded = recipeManager.addRecipe(recipe);
        assertTrue(isAdded, "Recipe should be added successfully.");
        assertEquals(1, recipeManager.listAllRecipes().size(), "There should be one recipe in the manager.");
    }

    @Test
    public void testAddDuplicateRecipe() {
        Recipe recipe1 = new Recipe("Pasta", "Pasta, Tomato Sauce", "Boil pasta, add sauce");
        Recipe recipe2 = new Recipe("Pasta", "Pasta, Cheese", "Boil pasta, add cheese");
        recipeManager.addRecipe(recipe1);
        boolean isAdded = recipeManager.addRecipe(recipe2);
        assertFalse(isAdded, "Duplicate recipe should not be added.");
        assertEquals(1, recipeManager.listAllRecipes().size(), "There should still be only one recipe in the manager.");
    }

    @Test
    public void testUpdateRecipe() {
        Recipe recipe = new Recipe("Salad", "Lettuce, Tomato", "Mix all ingredients");
        recipeManager.addRecipe(recipe);
        boolean isUpdated = recipeManager.updateRecipe("Salad", "Lettuce, Tomato, Cucumber", "Mix all ingredients well");
        assertTrue(isUpdated, "Recipe should be updated successfully.");
        Recipe updatedRecipe = recipeManager.listAllRecipes().get("Salad");
        assertEquals("Lettuce, Tomato, Cucumber", updatedRecipe.getIngredients(), "Ingredients should be updated.");
        assertEquals("Mix all ingredients well", updatedRecipe.getInstructions(), "Instructions should be updated.");
    }

    @Test
    public void testRemoveRecipe() {
        Recipe recipe = new Recipe("Soup", "Water, Vegetables", "Boil water, add vegetables");
        recipeManager.addRecipe(recipe);
        boolean isRemoved = recipeManager.removeRecipe("Soup");
        assertTrue(isRemoved, "Recipe should be removed successfully.");
        assertEquals(0, recipeManager.listAllRecipes().size(), "There should be no recipes in the manager.");
    }

    @Test
    public void testListAllRecipes() {
        Recipe recipe1 = new Recipe("Pizza", "Dough, Cheese", "Bake in oven");
        Recipe recipe2 = new Recipe("Cake", "Flour, Sugar", "Mix and bake");
        recipeManager.addRecipe(recipe1);
        recipeManager.addRecipe(recipe2);
        assertEquals(2, recipeManager.listAllRecipes().size(), "There should be two recipes in the manager.");
    }
}

