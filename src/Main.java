public class Main {
    public static void main(String[] args) {
        BankingService B = new BankingService(new AccountsList());
        Customer kCust = B.addCustomer("kathi", "cs200");
        Account kAcct = new Account(100465, kCust, 150);
        B.addAccount(kAcct);
        B.login("kathi", "cs200");
        System.out.println("Kathi's balance is " + kAcct.balance);  // prints 150
        B.withdraw(100465, 30);
        System.out.println("Kathi's balance is " + kAcct.balance);  // prints 120
    }
}
