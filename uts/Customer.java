import java.util.List;
import java.util.Random;

public class Customer {
    private String name;
    private List<Food> preferences;
    private int patienceLevel; // how long the customer is willing to wait in seconds
    
    public Customer(String name, List<Food> preferences) {
        this.name = name;
        this.preferences = preferences;
        this.patienceLevel = new Random().nextInt(300) + 100; // random patience level
    }
    
    public String getName() { return name; }
    public List<Food> getPreferences() { return preferences; }
    public int getPatienceLevel() { return patienceLevel; }
    
    // Method to reduce patience over time
    public void decreasePatience(int time) {
        patienceLevel -= time;
    }
    
    public boolean isImpatient() {
        return patienceLevel <= 0;
    }
}
