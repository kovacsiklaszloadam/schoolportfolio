package Banking;

import java.util.List;

public class SpeedUp extends BankAccount{
    public SpeedUp(Customer owner, String name, double balance) {
        super(owner, name, balance);

    }

    public double newPartnerBonus(List<Customer> transactionPartners, double balance, Customer partner) {
        if (transactionPartners.contains(partner)) {
            return balance;
        } else {
            return balance += 5000;
        }
    }

    @Override
    public double sendMoney(double balance) {
        balance -= 1000;
        return super.sendMoney(balance);
    }

    @Override
    public double receiveMoney(double balance) {
        balance -= 200;
        return super.receiveMoney(balance);
    }
}
