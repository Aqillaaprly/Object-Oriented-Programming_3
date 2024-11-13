public class ElectricityBill extends Employee implements Payable {
    private int mKwh;
    private String mCategory;

    public ElectricityBill(int mKwh, String mCategory) {
        this.mKwh = mKwh;
        this.mCategory = mCategory;
    }

    public int getmKwh() {
        return mKwh;
    }

    public void setmKwh(int mKwh) {
        this.mKwh = mKwh;
    }

    public String getmCategory() {
        return mCategory;
    }

    public void setmCategory(String mCategory) {
        this.mCategory = mCategory;
    }

    @Override
    public int getPaymentAmount() {
        return mKwh + getBasePrice();
    }

    public int getBasePrice() {
        int bPrice = 0;
        switch (mCategory) {
            case "R-1":
                bPrice = 100;
                break;
            case "R-2":
                bPrice = 200;
                break;
            default:
                break;
        }
        return bPrice;
    }

    public String getBillInfo() {
        return "kWH = " + mKwh + "\n" + "Category = " + mCategory + "(" + getBasePrice() + " per kWH)\n";
    }
}