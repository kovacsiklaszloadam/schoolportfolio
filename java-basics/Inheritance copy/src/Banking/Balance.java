package Banking;

import java.time.DayOfWeek;
import java.util.Date;

public class Balance extends BankAccount{
    public Balance(Customer owner, String name, double balance) {
        super(owner, name, balance);
    }


    public double sendMoney(double balance, double sentAmount) {
        balance -= sentAmount * 0.02;
        return super.sendMoney(balance);
    }

    public double receiveMoney(double balance, Date date, double receivedAmount) {
        if (date.getDay() == DayOfWeek.SATURDAY.getValue() || date.getDay() == DayOfWeek.SUNDAY.getValue()) {
            balance -= receivedAmount * 0.03;

        } else {
            balance -= receivedAmount * 0.01;
        }
        return super.receiveMoney(balance);
    }
}
