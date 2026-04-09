public class CreditCardPayment implements IPaymentMethod {

    @Override
    public void authorize() {
        System.out.println("Authorizing credit card...");
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }

    @Override
    public String generateReceipt(double amount) {
        return "Credit Card Receipt: $" + amount;
    }

}
