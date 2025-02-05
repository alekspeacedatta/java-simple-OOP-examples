public class Account extends Bank{
    private String mail,name;
    double balance;
    public Account(String mail, String password, double balance){
        this.mail = mail;
        this.balance = balance;
        this.name = password;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setPassword(String password) {
        this.name = password;
    }
    public double getBalance() {
        return balance;
    }
    public String getMail() {
        return mail;
    }
    public String getPassword() {
        return name;
    }
    public void fill(double moneyIN){
        balance += moneyIN;
    }
    public void widthDraw(double moneyOut){
        balance -= moneyOut;
    }
    public  String getAccountInfo(){
        String AccInfo= "Mail: " + mail + "\n" + "Password: " + name + "\n" + "Balance: " + balance + "$";
        return AccInfo;
    }
}
