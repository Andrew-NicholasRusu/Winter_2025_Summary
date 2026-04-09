public class Payment {

    public double amount;
    private String methodType;
    private String receipt;

    public Payment(double amount, String methodType, String receipt) {
        this.amount = amount;
        this.methodType = methodType;
        this.receipt = receipt;
    }

    public String toString() {
        return this.methodType + ": $" + this.amount + " | " + this.receipt;
    }
}
