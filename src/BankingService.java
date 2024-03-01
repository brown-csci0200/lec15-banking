import java.util.LinkedList;

public class BankingService {
    LinkedList<Account> accounts = new LinkedList<Account>();
    LinkedList<Customer> customers = new LinkedList<Customer>();

    public BankingService(){}

    public void addAccount(Account newA) {

        this.accounts.addFirst(newA);
    }

    public double getBalance(int forAcctNum) {
        Account acct = findAccount(forAcctNum);
        // for (Account acct:accounts) {
        //     if (acct.number == forAcctNum)
                return acct.balance;
        }
        return 0;
    }

    public double withdraw(int forAcctNum, double amt) {
        for (Account acct:accounts) {
            if (acct.number == forAcctNum) {
                acct.balance = acct.balance - amt;
                return amt;
            }
        }
        return 0;
    }

    public String login(String custname, String withPwd) {
        for (Customer cust:customers) {
            if (cust.name.equals(custname)) {
                if (cust.checkPwd(withPwd)) {
                // if (cust.password.equals(withPwd)) {
                    return "Welcome";
                } else {
                    return "Try Again";
                }
            }
        }
        return "Oops -- don't know this customer";
    }
}
