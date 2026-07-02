package schoolManagement;
public class Fee {
    private double amount;
    private String status = "Pending";

    public void payFee(double amount) {
        this.amount = amount;
        this.status = "Paid";
    }

    public double getAmount() {
    return amount;
}

    public String getStatus() {
        return status;
    }
}