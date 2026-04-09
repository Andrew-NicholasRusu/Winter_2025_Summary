public interface IPaymentMethod {

    void authorize();

    void processPayment(double amount);

    String generateReceipt(double amount);
}
