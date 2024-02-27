import java.util.LinkedList;

public class BankingService {
    private LinkedList<Account> accounts = new LinkedList<Account>();
    private LinkedList<Customer> customers = new LinkedList<Customer>();

    public BankingService(){}

    public void addAccount(Account newA) {
        this.accounts.addFirst(newA);
    }

    public double getBalance(int forAcctNum) {
        for (Account acct:accounts) {
            if (acct.numMatches(forAcctNum))
                return acct.getBalance();
        }
        return 0;
    }

    public double withdraw(int forAcctNum, double amt) {
        for (Account acct:accounts) {
            if (acct.numMatches(forAcctNum)) {
                return acct.withdraw(amt);
            }
        }
        return 0;
    }

    public String login(String custname, String withPwd) {
        for (Customer cust:customers) {
            if (cust.nameMatches(custname)) {
                if (cust.checkPwd(withPwd)) {
                    return "Welcome";
                } else {
                    return "Try Again";
                }
            }
        }
        return "Oops -- don't know this customer";
    }
}
