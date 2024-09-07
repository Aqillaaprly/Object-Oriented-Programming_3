package week2;

public class GameMain {
    public static void main(String[] args) {
        // Example usage
        GameRental rental1 = new GameRental();
        rental1.id = 1;
        rental1.memberName = "John Doe";
        rental1.gameName = "The Witcher 3";
        rental1.pricePerDay = 3.50;
        rental1.rentalDuration = 5;
        
        // Calculate and display the amount to pay
        rental1.calculateAmountToPay();
        rental1.displayData();


}
}