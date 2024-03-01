import java.util.HashMap;

public class AccountsHM implements IAcctSet {
    HashMap<Integer, Account> accounts;

    public AccountsHM() {
        this.accounts = new HashMap<Integer, Account>();
    }

    public void addAccount(Account newA) {
        this.accounts.put(newA.number, newA);
    }

    public Account findAccount(int forAcctNum) {
        return this.accounts.get(forAcctNum);
    }
}
