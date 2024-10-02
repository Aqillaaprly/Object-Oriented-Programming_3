package week5;

public class MainExperiment2 {
    public static void main(String[] args) {
        // Create Car object
        Car c = new Car();
        c.setBrand("Avanza");
        c.setCost(350000);

        // Create Driver object
        Driver d = new Driver();
        d.setName("John Doe");
        d.setCost(200000);

        // Create Customer object
        Customer cust = new Customer();
        cust.setName("Jane Doe");
        cust.setCar(c);
        cust.setDriver(d);
        cust.setDay(2);

        // Print total cost
        System.out.println("Total cost = " + cust.totalCostCalculation());

        // Print car brand
        System.out.println(cust.getCar().getBrand());  // Outputs "Avanza"
    }
}
