package Banking;

import java.util.Date;
import java.util.List;

public class BankAccount {

    private Customer owner;
    private String name;
    private double balance;
    private List<String> history;
    private List<Customer> transactionPartners;
    private Date lastUsage;

    public BankAccount(Customer owner, String name, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.name = name;

    }

    public double sendMoney(double balance) {
        return balance;

    }

    public double receiveMoney(double balance) {
        return balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getLastUsage() {
        return lastUsage;
    }

    public void setLastUsage(Date lastUsage) {
        this.lastUsage = lastUsage;
    }
}
