public class InternshipEmployee extends Employee implements Payable {
    private int mLength;

    public InternshipEmployee(String mName, int mLength) {
        this.mLength = mLength;
        this.mName = mName;
    }

    public int getmLength() {
        return mLength;
    }

    public void setmLength(int mLength) {
        this.mLength = mLength;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as Internship employee for " + mLength + " month/s\n";
        return info;
    }

    @Override
    public int getPaymentAmount() {
        return 0;
    }
}