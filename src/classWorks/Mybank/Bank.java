package classWorks.Mybank;

public class Bank {

    private int numberOfCustomer;
    private Account [] accounts = new Account[10];
    public void createAccountFor(String accountName, String pin) {

        Account account =  new Account("numberOfCustomer" + "", accountName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }

    public Account findAccount(String accountNumber) {

        for (Account account : accounts){
            if (account.getNumber().equals(accountNumber)){
                return account;
            }

        }
        return null;
    }

    public void deposit(int amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }
}
