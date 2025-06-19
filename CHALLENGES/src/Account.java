public class Account{
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount > 0) balance += amount;
        else balance = balance;
    }

    public boolean withdraw(double amount){
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public double getBalance(){
        return balance;
    }
}