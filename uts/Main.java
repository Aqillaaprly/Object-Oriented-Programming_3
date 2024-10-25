import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create the restaurant
        Restaurant restaurant = new Restaurant();
        
        // Create menu items
        Food burger = new Food("Burger", 5.99, new String[] {"Bun", "Patty", "Lettuce"}, 5);
        Food fries = new Food("Fries", 2.99, new String[] {"Potato", "Salt"}, 3);
        Food drink = new Food("Soda", 1.50, new String[] {"Water", "Sugar", "Syrup"}, 2);
        
        restaurant.addFoodToMenu(burger);
        restaurant.addFoodToMenu(fries);
        restaurant.addFoodToMenu(drink);
        
        // Hire employees
        Cook cook = new Cook("John", 2);
        Cashier cashier = new Cashier("Emily", 3);
        
        restaurant.hireEmployee(cook);
        restaurant.hireEmployee(cashier);
        
        // Create customers and their orders
        Customer customer1 = new Customer("Alice", Arrays.asList(burger, fries));
        Customer customer2 = new Customer("Bob", Arrays.asList(drink));
        
        // Place orders
        restaurant.placeOrder(customer1, Arrays.asList(burger, fries));
        restaurant.placeOrder(customer2, Arrays.asList(drink));
        
        // Process orders
        restaurant.processOrders();
        
        // Receive payment
        restaurant.receivePayment(10.50);
        
        System.out.println("Restaurant balance: $" + restaurant.getBalance());
    }
}
