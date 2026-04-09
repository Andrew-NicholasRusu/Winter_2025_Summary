import org.champ.BankAccount;
import org.champ.CheckingAccount;
import org.champ.SavingsAccount;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testSavingsWithdrawLimit() {
        SavingsAccount savings = new SavingsAccount("S123", 1000);
        assertTrue(savings.withdraw(100));
        assertTrue(savings.withdraw(100));
        assertTrue(savings.withdraw(100));
        assertFalse(savings.withdraw(100)); //Exceeds limit
        assertEquals(700, savings.getBalance());
    }

    @Test
    public void testCheckingOverdraft() {
        CheckingAccount checking = new CheckingAccount("C123", 500, 200);
        assertTrue(checking.withdraw(600)); // within overdraft
        assertTrue(checking.withdraw(50)); // still OK
        assertFalse(checking.withdraw(100)); // exceeds overdraft
        assertEquals(-150, checking.getBalance());
    }

    @Test
    public void testDeposit() {
        BankAccount account = new SavingsAccount("S456", 100);
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

}
