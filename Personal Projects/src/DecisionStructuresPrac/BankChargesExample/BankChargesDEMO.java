package DecisionStructuresPrac.BankChargesExample;

public class BankChargesDEMO
{
    public static void main(String[] args)
    {
        serviceFee account = new serviceFee (350.0, 25);
        System.out.printf("Total service fees: $%.2f%n", account.calculateServiceFees());
    }
}
