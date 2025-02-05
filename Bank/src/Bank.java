import java.util.ArrayList;

public class Bank {
    private  ArrayList <Account> AccountsCollection;
    public Bank(){
        AccountsCollection = new ArrayList<Account>();
    }
    public  void addAccount(Account account){
        AccountsCollection.add(account);
    }
    public void removeAccount(Account account){
        AccountsCollection.remove(account);
    }
    public void depositMoney(Account account, double moneyIn){
        account.fill(76389);
    }
    public void withDrawMoney(Account account, double moneyOut){
        account.widthDraw(5423);
    }
    public ArrayList<Account> getAccounts(){
        return AccountsCollection;
    }

}
