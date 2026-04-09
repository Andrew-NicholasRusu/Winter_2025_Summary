package DecisionStructuresPrac.BankChargesExample;

public class BankCharges
{
    private double balance;
    private int checksWritten;

    public BankCharges(double balance, int checksWritten) {
        this.balance = balance;
        this.checksWritten = checksWritten;
    }
    public double calculateServiceFees() {
        double serviceFee = 10.0; // Monthly fee

        double checkFee;
        if (checksWritten < 20) {
            checkFee = 0.10;
        } else if (checksWritten <= 39) {
            checkFee = 0.08;
        } else if (checksWritten <= 59) {
            checkFee = 0.06;
        } else {
            checkFee = 0.04;
        }

        serviceFee += checksWritten * checkFee;

        if (balance < 400) {
            serviceFee += 15.0;
        }

        return serviceFee;
    }
}
