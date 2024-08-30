public class Motor {
    private String brand;
    private int speed;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void startEngine() {
        System.out.println(brand + " engine started.");
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " accelerated. Speed is now " + speed + " km/h.");
    }

    public void brake() {
        speed -= 10;
        System.out.println(brand + " braked. Speed is now " + speed + " km/h.");
    }

    public void printStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
    }
}
