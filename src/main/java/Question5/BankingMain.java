package Question5;

public class BankingMain {
    public static void main(String[] args) {
        BankingSystem bankingSys = new BankingSystem();

        BankAccount accA = new BankAccount("XYZ44", 100000);
        BankAccount accB = new BankAccount("TUV31", 50000);

        bankingSys.addAccount(accA);
        bankingSys.addAccount(accB);

        System.out.println("Initial balance of account A is: " + accA.getBalance());
        System.out.println("Initial balance of account B is: " + accB.getBalance());

        boolean transferRes = bankingSys.transfer("XYZ44", "TUV31", 200);

        System.out.print("Transfer Result is: ");
        if (transferRes) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        System.out.println("Balance of Account A is: " + accA.getBalance());
        System.out.println("Balance of Account B is: " + accB.getBalance());
    }
}
