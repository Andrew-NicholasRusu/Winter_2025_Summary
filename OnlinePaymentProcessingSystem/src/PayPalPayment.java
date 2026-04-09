public class PayPalPayment implements IPaymentMethod{

    @Override
    public void authorize() {
        System.out.println("Logging in to PayPal...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }

    @Override
    public String generateReceipt(double amount) {
        return "Paypal Receipt: $" + amount;
    }

}
