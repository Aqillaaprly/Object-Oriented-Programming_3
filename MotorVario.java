public class MotorVario extends Motor {
    private int engineCapacity;

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void printStatus() {
        super.printStatus();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}
