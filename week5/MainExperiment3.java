package week5;

public class MainExperiment3 {
    public static void main(String[] args) {
        // Create Employee objects for machinist and assistant
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Employee assistant = new Employee("4567", "Patrick Star");

        // Create Railway object with machinist and assistant
        Railway railway = new Railway("Gaya Baru", "Bisnis", machinist, assistant);

        // Display the railway information
        System.out.println(railway.info());
    }
}