public class Pencil {
    private String brand;
    private String color;
    private String type;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void write() {
        System.out.println(brand + " is writing.");
    }

    public void printStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}
