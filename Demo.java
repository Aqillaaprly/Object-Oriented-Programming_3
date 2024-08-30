public class Demo {
    public static void main(String[] args) {
        MotorBeat motorBeat = new MotorBeat();
        MotorVario motorVario = new MotorVario();

        motorBeat.setBrand("Honda Beat");
        motorBeat.setSpeed(0);
        motorBeat.setEngineCapacity(110);
        motorBeat.setColor("Red");
        motorBeat.startEngine();
        motorBeat.accelerate();
        motorBeat.printStatus();
        System.out.println("============================================");

        motorVario.setBrand("Honda Vario");
        motorVario.setSpeed(0);
        motorVario.setEngineCapacity(125);
        motorVario.setColor("Blue");
        motorVario.startEngine();
        motorVario.accelerate();
        motorVario.printStatus();
        System.out.println("============================================");

        Pencil pencil = new Pencil();
        pencil.setBrand("Faber-Castell");
        pencil.setColor("Black");
        pencil.setType("HB");
        pencil.write();
        pencil.printStatus();
        System.out.println("============================================");

        Bottle bottle = new Bottle();
        bottle.setBrand("Tupperware");
        bottle.setVolume(500);
        bottle.setMaterial("Plastic");
        bottle.setColor("Green");
        bottle.fill();
        bottle.printStatus();
        System.out.println("============================================");
    }
}
