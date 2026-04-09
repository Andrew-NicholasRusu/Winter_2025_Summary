public class BankTransferPayment implements IPaymentMethod{

    @Override
    public void authorize() {
        System.out.println("Verifying bank account...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer: $" + amount);
    }

    @Override
    public String generateReceipt(double amount) {
        return "Bank Transfer Receipt: $" + amount;
    }


}
