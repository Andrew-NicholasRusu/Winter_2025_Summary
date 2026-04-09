import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private Map<String, List<Payment>> paymentHistory = new HashMap();

    public void processCustomerPayment(String customerEmail, double amount, IPaymentMethod method) {
        method.authorize();
        method.processPayment(amount);
        String receipt = method.generateReceipt(amount);
        Payment payment = new Payment(amount, method.getClass().getSimpleName(), receipt);
        this.paymentHistory.putIfAbsent(customerEmail, new ArrayList());
        ((List)this.paymentHistory.get(customerEmail)).add(payment);
        System.out.println("Payment completed for " + customerEmail);
        System.out.println("Receipt: " + receipt);
        System.out.println();
    }

    public void showCustomerHistory(String email) {
        List<Payment> history = (List)this.paymentHistory.get(email);
        if (history != null && !history.isEmpty()) {
            System.out.println("Payment History for " + email + ":");

            for(Payment payment : history) {
                System.out.println("  - " + payment);
            }
        } else {
            System.out.println("No payment history found for " + email);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Main system = new Main();
        system.processCustomerPayment("alice@example.com", (double)120.5F, new CreditCardPayment());
        system.processCustomerPayment("bob@example.com", (double)75.0F, new PayPalPayment());
        system.processCustomerPayment("carol@example.com", (double)200.0F, new BankTransferPayment());
        system.showCustomerHistory("alice@example.com");
        system.showCustomerHistory("bob@example.com");
        system.showCustomerHistory("carol@example.com");
    }
}
