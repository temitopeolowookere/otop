package classWorks.Mybank;

public class Account {
    private int balance;

    private String Number;

    private  String name;
     private String pin;


    public String getNumber() {
        return Number;
    }

    public String getName() {
        return name;
    }

    public Account(String accountNumber, String accountName, String pin) {
        this.Number = accountNumber;
        name = accountName;
        this.pin = pin;

    }


    public int getBalance(String pin) {
        if (pin.equals(this.pin)) return balance;
       return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) balance = getBalance("1234") + amount;

    }

    public void withdraw( int amount, String pin) {
        if(this.pin.equals(pin)&& amount <= balance && amount > 0){
            balance = balance - amount;

        }

    }


}
