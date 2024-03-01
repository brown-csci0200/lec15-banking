import java.util.LinkedList;

public class BankingService {
    // LinkedList<Account> accounts = new LinkedList<Account>();
    // LinkedList<Customer> customers = new LinkedList<Customer>();
    IAcctSet accounts;
    CustomerList customers;

    public BankingService(IAcctSet accounts){
        this.accounts = accounts;
        this.customers = new CustomerList();
    }

    public void addAccount(Account newA) {
        this.accounts.addAccount(newA);
    }

    public Customer addCustomer(String username, String pwd) {
        return this.customers.addCustomer(username, pwd);
    }

    public double getBalance(int forAcctNum) {
        Account acct = this.accounts.findAccount(forAcctNum);
        return acct.balance;
    }

    public double withdraw(int forAcctNum, double amt) {
        Account acct = this.accounts.findAccount(forAcctNum);
        acct.balance = acct.balance - amt;
        return amt;
    }

    public String login(String custname, String withPwd) {
        Customer cust = this.customers.findCustomer(custname);
        if (cust.checkPwd(withPwd)) {
            return "Welcome";
        } else {
            return "Try Again";
        }
    }
}
