public class Bicycle{
    private String brand;
    private int speed;
    private int gear;

    public void setBrand(String newValue){
        brand = newValue;
    }

    public void changeGear(int newValue){
        gear = newValue;
    }

    public void increaseSpeed(int increment){
        speed = speed + increment;
    }

    public void brake(int decrement){
        speed = speed - decrement;
    }

    public void printStatus(){
        System.out.println("Brand: " +brand);
        System.out.println("Speed: " +speed);
        System.out.println("Gear: " +gear);
    }
}