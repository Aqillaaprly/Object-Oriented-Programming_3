public class Member {
    private String name;
    private String address;
    private float deposit;

    public void setname(String name){
        this.name=name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public float getDeposit(){
        return deposit;
    }
    public void deposit(float money){
        deposit +=money;
    }
    public void loan(float money){
        deposit -= money;
    }
}