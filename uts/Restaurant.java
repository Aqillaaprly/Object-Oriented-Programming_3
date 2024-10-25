import java.util.*;

public class Restaurant {
    private List<Food> menu;
    private Queue<Order> orderQueue;
    private List<Employee> employees;
    private double balance;

    public Restaurant() {
        menu = new ArrayList<>();
        orderQueue = new LinkedList<>();
        employees = new ArrayList<>();
        balance = 0;
    }

    public void addFoodToMenu(Food food) {
        menu.add(food);
    }

    public void hireEmployee(Employee employee) {
        employees.add(employee);
    }

    public void placeOrder(Customer customer, List<Food> foodItems) {
        Order order = new Order(customer, foodItems);
        orderQueue.add(order);
        System.out.println("Order placed for " + customer.getName());
    }

    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            for (Food food : order.getFoodItems()) {
                for (Employee employee : employees) {
                    if (employee instanceof Cook) {
                        ((Cook) employee).cookFood(food);
                    }
                }
            }
            order.completeOrder();
        }
    }

    public void receivePayment(double amount) {
        balance += amount;
        System.out.println("Received payment: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}
