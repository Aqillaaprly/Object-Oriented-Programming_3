package week5;

public class Customer {
    
    private String name;
    private Car car;
    private Driver driver;
    private int day;
    public Customer() {
    }
    public Customer(String name, Car car, Driver driver, int day) {
        this.name = name;
        this.car = car;
        this.driver = driver;
        this.day = day;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int totalCostCalculation() {
        return car.carCostCalculation(day) + driver.driverCostCalculation(day);
    }
}