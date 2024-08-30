public class Bottle {
    private String brand;
    private int volume;
    private String material;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fill() {
        System.out.println(brand + " is being filled.");
    }

    public void printStatus() {
        System.out.println("Brand: " + brand);
        System.out.println("Volume: " + volume + " ml");
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
    }
}
