import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private double balance;
    private List<Food> menu;
    private List<Employee> employees;
    private List<Order> orders;
    private List<Ingredient> ingredientStock; // List of ingredients in stock

    public Restaurant() {
        this.balance = 0.0;
        this.menu = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.ingredientStock = new ArrayList<>();
    }

    public void addIngredientToStock(Ingredient ingredient) {
        ingredientStock.add(ingredient);
    }

    public void addFoodToMenu(Food food) {
        menu.add(food);
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void placeOrder(Customer customer, List<Food> orderedFoods) {
        for (Food food : orderedFoods) {
            if (!canFulfillOrder(food)) {
                System.out.println("Sorry, we cannot fulfill the order for " + food.getName() + " due to insufficient stock.");
                return;
            }
        }
        orders.add(new Order(customer, orderedFoods));
        System.out.println("Order placed successfully for " + customer.getName());
    }

    public void processOrders() {
        for (Order order : orders) {
            Customer customer = order.getCustomer();
            List<Food> foods = order.getFoodItems(); // Correctly accessing the food items
            for (Food food : foods) {
                deductIngredients(food);
            }
            order.completeOrder(); // Mark the order as complete
        }
        orders.clear();
    }

    private boolean canFulfillOrder(Food food) {
        for (Food.IngredientRequirement requirement : food.getIngredients()) {
            Ingredient stockIngredient = findIngredient(requirement.getIngredient().getName());
            if (stockIngredient == null || stockIngredient.getQuantity() < requirement.getQuantity()) {
                return false; // Insufficient stock
            }
        }
        return true;
    }

    private void deductIngredients(Food food) {
        for (Food.IngredientRequirement requirement : food.getIngredients()) {
            Ingredient stockIngredient = findIngredient(requirement.getIngredient().getName());
            if (stockIngredient != null) {
                stockIngredient.decreaseQuantity(requirement.getQuantity());
            }
        }
    }

    private Ingredient findIngredient(String ingredientName) {
        for (Ingredient ingredient : ingredientStock) {
            if (ingredient.getName().equals(ingredientName)) {
                return ingredient;
            }
        }
        return null; // Ingredient not found in stock
    }

    public void receivePayment(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
