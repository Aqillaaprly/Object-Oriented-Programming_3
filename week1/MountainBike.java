public class MountainBike extends Bicycle{

    private String suspentionType;

    public void setSuspentionType(String newValue){
        suspentionType = newValue;
    }

    public void printStatus(){
        super.printStatus();
        System.out.println("Suspention Type: " +suspentionType);
    }
}
