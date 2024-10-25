import java.util.List;

public class Customer {
    private String name;
    private List<Food> preferences;
    private int patience;

    public Customer(String name, List<Food> preferences, int patience) {
        this.name = name;
        this.preferences = preferences;
        this.patience = patience;
    }

    public String getName() {
        return name;
    }

    public List<Food> getPreferences() {
        return preferences;
    }

    public int getPatience() {
        return patience;
    }

    public void decreasePatience() {
        patience -= 1;
    }

    public boolean hasLostPatience() {
        return patience <= 0;
    }
}
