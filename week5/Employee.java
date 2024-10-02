package week5;

public class Employee {
    // Private attributes
    private String identityNumber;
    private String name;

    // Constructor
    public Employee(String identityNumber, String name) {
        this.identityNumber = identityNumber;
        this.name = name;
    }

    // Getter and Setter for identityNumber
    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        String info = "";
        info += "Identity Number: " + this.identityNumber + "\n";
        info += "Name: " + this.name + "\n";
        return info;
    }
}
