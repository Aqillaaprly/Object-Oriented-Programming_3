package week5;

public class MainQuestion {
    public static void main(String[] args) {
        // Create an Employee object for machinist
        Employee machinist = new Employee("1234", "Bob");

        // Create a Railway object with only the machinist (no assistant)
        Railway railway = new Railway("Gaya Baru", "Bisnis", machinist);

        // Print the railway information
        System.out.println(railway.info());
    }
}