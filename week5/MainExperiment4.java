package week5;

public class MainExperiment4 {
    public static void main(String[] args) {
        // Create a Passenger
        Passenger p = new Passenger("12345", "Mr. Krab");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassenger(p, 1);
        System.out.println(carriage.info());
    }
}