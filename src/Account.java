public class Account {
    int number;
    Customer owner;
    double balance;

    Account(int num, Customer c, double bal){
        this.number = num;
        this.owner = c;
        this.balance = bal;
    }
}
