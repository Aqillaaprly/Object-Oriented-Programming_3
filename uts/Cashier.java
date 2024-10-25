public class Cashier extends Employee {

    public Cashier(String name, int skillLevel) {
        super(name, "Cashier", skillLevel);
    }

    public void processPayment(Customer customer, Order order) {
        System.out.println(name + " processed payment for " + customer.getName());
    }
}
