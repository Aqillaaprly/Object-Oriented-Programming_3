package week5;

public class Seat {
    private String number;
    private Passenger passenger;

    // Constructor
    public Seat(String number) {
        this.number = number;
        this.passenger = null;  // Default to no passenger
    }

    // Getter and Setter for number
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    // Getter and Setter for passenger
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    // Info method
    public String info() {
        String info = "";
        info += "Number: " + number + "\n";
        if (this.passenger != null) {
            info += "Passenger: " + passenger.info() + "\n";
        }
        return info;
    }
}