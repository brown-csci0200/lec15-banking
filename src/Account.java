public class Account {
    private int number;
    private Customer owner;
    private double balance;

    Account(int num, Customer c, double bal){
        this.number = num;
        this.owner = c;
        this.balance = bal;
    }

    public boolean numMatches(int num) {
        return this.number == num;
    }

    double withdraw(double amt) {
        if (this.balance >= amt)
            this.balance = this.balance - amt;
        return amt;
    }

    public double getBalance() { return this.balance; }

    void printBalance() {
        System.out.println("Kathi's balance is " + this.balance);
    }
}
