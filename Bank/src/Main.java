import java.util.ArrayList;
public class Main {
    public static void main(String args[]){
        Bank bank = new Bank();
        Account account1 = new Account("Makrine77@gmail.com", "makeirne", 4887637);
        Account account2 = new Account("faleqs33@gmail.com", "Marvelfaza4-", 510);
        ArrayList <Account> accountArrayList = bank.getAccounts();
        bank.addAccount(account1);
        bank.addAccount(account2);
        for (Account account : accountArrayList){
            System.out.println(account.getAccountInfo() + "\n");
        }

        bank.depositMoney(account1, 878);
        bank.withDrawMoney(account1, 7389233);

        bank.depositMoney(account2, 672898736);
        bank.withDrawMoney(account2, 673214);

        System.out.println("AFTER WITHDRAW AND DEPOSIT MONEY \n");
        for(Account account: accountArrayList){
            System.out.println(account.getAccountInfo() + "\n");
        }

        System.out.println("AFTER REMOVING ACCOUNT 1 \n");
        bank.removeAccount(account1);
        for(Account account: accountArrayList){
            System.out.println(account.getAccountInfo() + "\n");
        }
        Account account3 = new Account("qobulashvilia@icloud.com", "Marvelfaza4-", 180);

        System.out.println(account3.getAccountInfo());

    }
}
