package Banking;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Date;
import java.util.List;

public class Customer {

    private final String name;
    private int age;
    private final String gender;
    private List<BankAccount> bankAccount;
    private Date lastUsageDate;
    private List<BankAccount> partnerAccounts;

    public Customer(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void createAccount(BankAccount account) {
        if (bankAccount.contains(account)) {
            System.out.println("No account name duplication is allowed");
        } else {
            bankAccount.add(account);
        }
    }

    public void sendMoney(BankAccount senderAccount, Customer partner, BankAccount partnerAccount, int amount) {
        if (partner.bankAccount.contains(partnerAccount)) {
            senderAccount.sendMoney(senderAccount.getBalance());
            senderAccount.setBalance(senderAccount.getBalance() - amount);

            partnerAccount.receiveMoney(partnerAccount.getBalance());
            partnerAccount.setBalance(senderAccount.getBalance() + amount);

            System.out.println(amount + "Ft sent to " + partner + " from the account " + senderAccount + " at " + lastUsageDate.getDay());

            if (!partnerAccounts.contains(partnerAccount)) {
                partnerAccounts.add(partnerAccount);
            }
        } else {
            System.out.println("There is no sender account under the name " + senderAccount);
        }
    }

    public void receiveMoney(BankAccount receiverAccountName, Customer sender, BankAccount senderAccount, int amount) {
        if (sender.bankAccount.contains(senderAccount)) {
            receiverAccountName.receiveMoney(receiverAccountName.getBalance());
            receiverAccountName.setBalance(receiverAccountName.getBalance() + amount);
        }

    }
}
