package week5;

import java.util.*; // Import necessary classes

class Product {
    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails() {
        return "Product ID: " + id + "\nName: " + name + "\nPrice: $" + price;
    }
}

class Customer {
    private String customerId;
    private String name;
    private List<Product> cart;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        cart.add(product);
        System.out.println(product.getDetails() + " has been added to your cart.");
    }

    public Order placeOrder() {
        Order order = new Order(UUID.randomUUID().toString(), this);
        for (Product product : cart) {
            order.addProduct(product);
        }
        order.calculateTotal();
        cart.clear(); // Clear the cart after placing the order
        return order;
    }

    public String getName() {
        return name;
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;
    private double totalAmount;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice();
        }
        return totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderInfo() {
        StringBuilder info = new StringBuilder("Order ID: " + orderId + "\nCustomer: " + customer.getName() + "\nProducts:\n");
        for (Product product : products) {
            info.append(product.getDetails()).append("\n");
        }
        info.append("Total Amount: $").append(totalAmount);
        return info.toString();
    }
}

class Payment {
    private String paymentId;
    private double amount;
    private String status;

    public Payment(String paymentId, double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.status = "Pending";
    }

    public void processPayment() {
        // Simulate payment processing
        this.status = "Completed";
        System.out.println("Payment processed successfully!");
    }

    public String getPaymentInfo() {
        return "Payment ID: " + paymentId + "\nAmount: $" + amount + "\nStatus: " + status;
    }
}
