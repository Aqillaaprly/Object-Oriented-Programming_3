package week5;

public class Carriage {
    private String code;
    private Seat[] seatArray;
    public Carriage(String code, int amount) {
        this.code = code;
        this.seatArray = new Seat[amount];
        this.seatInit();  // Initialize the seats
    }
    private void seatInit() {
        for (int i = 0; i < seatArray.length; i++) {
            this.seatArray[i] = new Seat(String.valueOf(i + 1));
        }
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setPassenger(Passenger passenger, int number) {
        this.seatArray[number - 1].setPassenger(passenger);  // Seat number starts at 1
    }
    public String info() {
        String info = "";
        info += "Code: " + code + "\n";
        for (Seat seat : seatArray) {
            info += seat.info();
        }
        return info;
    }
    
}