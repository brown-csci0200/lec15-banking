import java.util.LinkedList;

public class Customer {
    String name;
    String password;
    LinkedList<Account> accounts = new LinkedList<Account>();

    public Customer(String nm, String pwd){
        this.name = nm;
        this.password = pwd;
    }

    public void addAccount(Account newAcct) {
        this.accounts.addFirst(newAcct);
    }
}
