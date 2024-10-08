package Banking;

public class Savings extends BankAccount{

    public Savings(Customer owner, String name, double balance) {
        super(owner, name, balance);
    }

    @Override
    public double sendMoney(double balance) {
        balance -= 100;
        return super.sendMoney(balance);
    }

    @Override
    public double receiveMoney(double balance) {
        balance -= 20;
        return super.receiveMoney(balance);
    }
}
