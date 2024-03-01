import java.util.LinkedList;

public class AccountsList implements IAcctSet {
    LinkedList<Account> accounts;

    public AccountsList() {
        this.accounts = new LinkedList<Account>();
    }

    public void addAccount(Account newA) {
        this.accounts.addFirst(newA);
    }

    public Account findAccount(int forAcctNum) {
        for(Account acct:accounts) {
            if (acct.number == forAcctNum)
                return acct;
        }
        return null;
    }
}
