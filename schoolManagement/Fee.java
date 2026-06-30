package schoolManagement;
class Fee {
    private double amount;
    private String status = "Pending";

    public void payFee(double amount){
        this.amount = amount;
        this.status= "Paid";
    }
    public String getStatus(){
        return status;
    }
}