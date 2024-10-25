import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("+============================================================================+");
        Scanner scanner = new Scanner(System.in);
        System.out.println("+============================================================================+");

        // Create restaurant and menu
        Restaurant restaurant = new Restaurant();

        // Create ingredients and add to stock
        Ingredient bun = new Ingredient("Bun", 10);
        Ingredient patty = new Ingredient("Patty", 10);
        Ingredient lettuce = new Ingredient("Lettuce", 5);
        Ingredient potato = new Ingredient("Potato", 15);
        Ingredient salt = new Ingredient("Salt", 10);
        Ingredient water = new Ingredient("Water", 20);
        Ingredient sugar = new Ingredient("Sugar", 10);
        Ingredient syrup = new Ingredient("Syrup", 10);

        restaurant.addIngredientToStock(bun);
        restaurant.addIngredientToStock(patty);
        restaurant.addIngredientToStock(lettuce);
        restaurant.addIngredientToStock(potato);
        restaurant.addIngredientToStock(salt);
        restaurant.addIngredientToStock(water);
        restaurant.addIngredientToStock(sugar);
        restaurant.addIngredientToStock(syrup);

        // Define foods and their required ingredients
        Food burger = new Food("Burger", 5.99, 5);
        burger.addIngredient(bun, 1);
        burger.addIngredient(patty, 1);
        burger.addIngredient(lettuce, 1);

        Food fries = new Food("Fries", 2.99, 3);
        fries.addIngredient(potato, 2);
        fries.addIngredient(salt, 1);

        Food drink = new Food("Soda", 1.50, 2);
        drink.addIngredient(water, 1);
        drink.addIngredient(sugar, 1);
        drink.addIngredient(syrup, 1);

        restaurant.addFoodToMenu(burger);
        restaurant.addFoodToMenu(fries);
        restaurant.addFoodToMenu(drink);

        // Hire employees
        Cook cook = new Cook("Aqilla", 2);
        Cashier cashier = new Cashier("Serly", 3);
        
        restaurant.hireEmployee(cook);
        restaurant.hireEmployee(cashier);

        boolean continueServing = true;
        
        while (continueServing) {
            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            // Prompt for initial patience level
            System.out.print("Enter initial patience level (1-10): ");
            int initialPatience = Integer.parseInt(scanner.nextLine());

            List<Food> selectedFoods = new ArrayList<>();
            System.out.println("Menu:\n1. Burger - $5.99\n2. Fries - $2.99\n3. Soda - $1.50");
            System.out.print("Enter item numbers to order (e.g., 1 2): ");
            
            String[] foodChoices = scanner.nextLine().split(" ");
            for (String choice : foodChoices) {
                switch (choice) {
                    case "1":
                        selectedFoods.add(burger);
                        break;
                    case "2":
                        selectedFoods.add(fries);
                        break;
                    case "3":
                        selectedFoods.add(drink);
                        break;
                    default:
                        System.out.println("Invalid choice: " + choice);
                }
            }

            Customer customer = new Customer(customerName, selectedFoods, initialPatience);
            System.out.println("Customer " + customer.getName() + " ordered: ");
            for (Food food : selectedFoods) {
                System.out.println("- " + food.getName());
            }
            System.out.println("+============================================================================+");
            // Process orders
            restaurant.placeOrder(customer, selectedFoods);

            for (int i = 0; i < selectedFoods.size(); i++) {
                if (customer.hasLostPatience()) {
                    System.out.println(customer.getName() + " has left due to impatience!");
                    break;
                }
                
                // Simulate cooking each food item
                cook.cookFood(selectedFoods.get(i));
                
                // Decrease customer patience after each item is cooked
                customer.decreasePatience();
                System.out.println(customer.getName() + "'s patience level: " + customer.getPatience());
                
                if (customer.getPatience() == 2) {
                    System.out.println("Warning: " + customer.getName() + " is getting impatient!");
                }
            }
            System.out.println("+============================================================================+");
            // Check if the customer is still present to receive the order and make payment
            if (!customer.hasLostPatience()) {
                restaurant.processOrders();

                // Payment
                double totalAmount = selectedFoods.stream().mapToDouble(Food::getPrice).sum();
                restaurant.receivePayment(totalAmount);

                System.out.println("Restaurant balance: $" + restaurant.getBalance());
            }

            System.out.print("Serve another customer? (yes/no): ");
            continueServing = scanner.nextLine().equalsIgnoreCase("yes");
        }
        
        System.out.println("+============================================================================+");
        System.out.println("Closing restaurant for the day. Final balance: $" + restaurant.getBalance());
        scanner.close();
    }
}