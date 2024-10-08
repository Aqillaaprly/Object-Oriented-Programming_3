package week5;

public class Driver {
    private String name;
    private int cost;

    public Driver() {
    }

    public Driver(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for cost
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    // Method to calculate driver cost
    public int driverCostCalculation(int days) {
        return cost * days;
    }
}


