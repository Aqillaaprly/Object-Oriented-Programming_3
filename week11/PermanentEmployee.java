public class PermanentEmployee extends Employee
        implements Payable {
    private int mSalary;

    public PermanentEmployee(String mName, int mSalary) {
        this.mSalary = mSalary;
        this.mName = mName;
    }

    public int getmSalary() {
        return mSalary;
    }

    public void setmSalary(int mSalary) {
        this.mSalary = mSalary;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (mSalary + 0.05 * mSalary);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as Permanent employee with salary " + mSalary + "\n";
        return info;
    }
}