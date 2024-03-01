import java.util.LinkedList;

public class CustomerList {
    LinkedList<Customer> customers;

    public CustomerList() {
        this.customers = new LinkedList<Customer>();
    }

    public Customer addCustomer(String username, String pwd) {
        Customer newC = new Customer(username, pwd);
        customers.add(newC);
        return newC;
    }

    public Customer findCustomer(String custname) {
        for (Customer cust:customers) {
            if (cust.name.equals(custname))
                return cust;
        }
        return null;
    }
}
