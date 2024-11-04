import java.util.ArrayList;
import java.util.List;

public class Food {
    private String name;
    private double price;
    private int cookingTime;
    private List<IngredientRequirement> ingredients;

    public Food(String name, double price, int cookingTime) {
        this.name = name;
        this.price = price;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<IngredientRequirement> getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient, int quantity) {
        ingredients.add(new IngredientRequirement(ingredient, quantity));
    }

    // Nested class to store ingredient requirements
    public static class IngredientRequirement {
        private Ingredient ingredient;
        private int quantity;

        public IngredientRequirement(Ingredient ingredient, int quantity) {
            this.ingredient = ingredient;
            this.quantity = quantity;
        }

        public Ingredient getIngredient() {
            return ingredient;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
