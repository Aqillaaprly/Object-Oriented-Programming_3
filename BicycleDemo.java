public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle byc1 = new Bicycle();
        Bicycle byc2 = new Bicycle();
        MountainBike byc3 = new MountainBike();

        byc1.setBrand("Polygone");
        byc1.increaseSpeed(10);
        byc1.changeGear(2);
        byc1.printStatus();

        byc2.setBrand("Wiim Cycle");
        byc2.increaseSpeed(10);
        byc2.changeGear(2);
        byc2.increaseSpeed(10);
        byc2.changeGear(3);
        byc2.printStatus();

        byc3.setBrand("Klinee");
        byc3.increaseSpeed(5);
        byc3.changeGear(7);
        byc3.setSuspentionType("Gas Suspention");
        byc3.printStatus();
    }
}
