package tddClass;

public class Account {
    private int balance;

    public Account(){

    }

    public void deposit(int amount) {
        balance = balance + amount;

    }


    public int getbalance() {
        return balance;

    }

    public void withdraw(int amount) {
        balance = balance - amount;
    }
}
