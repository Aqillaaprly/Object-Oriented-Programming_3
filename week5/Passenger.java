package week5;

public class Passenger {
    private String identityCard;
    private String name;

    // Constructor
    public Passenger(String identityCard, String name) {
        this.identityCard = identityCard;
        this.name = name;
    }

    // Getter and Setter for identityCard
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Info method
    public String info() {
        String info = "";
        info += "Identity Card: " + identityCard + "\n";
        info += "Name: " + name + "\n";
        return info;
    }
}