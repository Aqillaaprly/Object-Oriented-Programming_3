import java.util.List;

public class Order {
    private Customer customer;
    private List<Food> foodItems; // This is the list of food items ordered
    private boolean isCompleted;

    public Order(Customer customer, List<Food> foodItems) {
        this.customer = customer;
        this.foodItems = foodItems;
        this.isCompleted = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Food> getFoodItems() { // Make sure this method exists
        return foodItems;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void completeOrder() {
        isCompleted = true;
        System.out.println("Order for " + customer.getName() + " is completed.");
    }
}