package Question5;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private Map<String, BankAccount> accs = new HashMap<>();

    public void addAccount(BankAccount acc) {
        accs.put(acc.getAccountId(), acc);
    }

    public boolean transfer(String fromAccId, String toAccId, double amount) {
        BankAccount fromAccount = accs.get(fromAccId);
        BankAccount toAccount = accs.get(toAccId);

        if (fromAccount == null || toAccount == null) {
            System.out.println("Invalid account ID. Please check once again.");
            return false;
        }

        boolean withdrawalSuccess = fromAccount.withdraw(amount);
        if (withdrawalSuccess) {
            try {
                simulateExternalBankProcessing();
                toAccount.deposit(amount);
                System.out.println("Transferred Rupees " + amount + " from " + fromAccId + " to " + toAccId);
                return true;
            } catch (Exception e) {
                fromAccount.deposit(amount);
                System.out.println("Transaction is failed. We have rolled back the transfer.");
                return false;
            }
        } else {
            System.out.println("Insufficient funds in account. " + fromAccId);
            return false;
        }
    }

    private void simulateExternalBankProcessing() throws Exception {
        if (Math.random() < 0.2) {
            throw new Exception("Simulated external bank error.");
        }
    }
}
