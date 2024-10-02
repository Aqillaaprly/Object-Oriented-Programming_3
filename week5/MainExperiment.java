package week5;

public class MainExperiment {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("P001", "Laptop", 1200.50);
        Product product2 = new Product("P002", "Smartphone", 800.75);

        // Create customer
        Customer customer = new Customer("C001", "Alice");

        // Customer adds products to the cart
        customer.addToCart(product1);
        customer.addToCart(product2);

        // Customer places an order
        Order order = customer.placeOrder();
        System.out.println("\n=== Order Details ===");
        System.out.println(order.getOrderInfo());

        // Process payment for the order
        Payment payment = new Payment(UUID.randomUUID().toString(), order.getTotalAmount());
        System.out.println("\n=== Payment Details ===");
        System.out.println(payment.getPaymentInfo());
        payment.processPayment();
        System.out.println(payment.getPaymentInfo());
    }
}