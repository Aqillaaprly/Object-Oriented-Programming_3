public class Tester1 {
    public static void main(String[] args) {
        Employee e;
        Payable p;

        PermanentEmployee pEmp = new PermanentEmployee("Aqilla", 400);
        InternshipEmployee iEmp = new InternshipEmployee("Ada", 6);
        ElectricityBill eBill = new ElectricityBill(100, "R-1");

        e = pEmp;
        System.out.println(e.getEmployeeInfo());

        e = iEmp;
        System.out.println(e.getEmployeeInfo());

    }
}