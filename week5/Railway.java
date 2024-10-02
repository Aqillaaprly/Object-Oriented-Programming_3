package week5;

public class Railway {
    // Private attributes
    private String name;
    private String railwayClass;
    private Employee machinist;
    private Employee assistant;

    // Constructor with 3 parameters
    public Railway(String name, String railwayClass, Employee machinist) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = null;  // Default to null if assistant isn't provided
    }

    // Constructor with 4 parameters
    public Railway(String name, String railwayClass, Employee machinist, Employee assistant) {
        this.name = name;
        this.railwayClass = railwayClass;
        this.machinist = machinist;
        this.assistant = assistant;
    }

    // Getter and Setter methods for all attributes (if needed)

    // Info method that includes null check for assistant
    public String info() {
        String info = "";
        info += "Name: " + this.name + "\n";
        info += "Railway Class: " + this.railwayClass + "\n";
        info += "Machinist: " + this.machinist.info() + "\n";
        if (this.assistant != null) {
            info += "Assistant: " + this.assistant.info() + "\n";
        } else {
            info += "Assistant: None\n";
        }
        return info;
    }
}
