public class Food {
    private String name;
    private double price;
    private String[] ingredients;
    private int cookingTime; // in seconds
    
    public Food(String name, double price, String[] ingredients, int cookingTime) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.cookingTime = cookingTime;
    }
    
    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getCookingTime() { return cookingTime; }
    
    // Example method to describe the food
    public String describeFood() {
        return name + ": " + price + " - Cooking time: " + cookingTime + " seconds";
    }
}
