public class Main {
    public static void main(String[] args) {
        BankingService B = new BankingService();
        Customer kCust = new Customer("kathi", "cs18");
        Account kAcct = new Account(100465, kCust, 150);
        B.addAccount(kAcct);
        kAcct.printBalance();
        B.withdraw(100465, 30);
        kAcct.printBalance();
    }
}
