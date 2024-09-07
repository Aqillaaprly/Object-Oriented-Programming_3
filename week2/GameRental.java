package week2;

public class GameRental {
    public int id;
    public String memberName;
    public String gameName;
    public double pricePerDay;
    public int rentalDuration;
    public double amountToPay;

    // Method to calculate the total amount to pay
    public void calculateAmountToPay() {
        amountToPay = pricePerDay * rentalDuration;
    }

    // Method to display the rental data
    public void displayData() {
        System.out.println("ID           : " + id);
        System.out.println("Member Name  : " + memberName);
        System.out.println("Game Name    : " + gameName);
        System.out.println("Price per Day: " + pricePerDay);
        System.out.println("Duration (days): " + rentalDuration);
        System.out.println("Total Amount to Pay: " + amountToPay);
    }
}
