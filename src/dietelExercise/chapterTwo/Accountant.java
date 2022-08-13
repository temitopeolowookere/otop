package dietelExercise.chapterTwo;

public class Accountant {
    private String name;
    private  double balance;


    public Accountant( String name, double balance){
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
            return name;
    }
    public double getBalance(){
            return  balance;
    }

    public void deposit (double depositAmount){
        if( depositAmount > 0.0){
            balance = balance+ depositAmount;
        }
    }
    public void withdraw(double withdrawlAmount) {
        if(withdrawlAmount > balance){
            getBalance();
            System.out.println(" withdraw amount exceeded account balance.");
        }
        else{
             balance = getBalance()-withdrawlAmount;
        }
    }

    public double getWithdrawal(){
        return balance;
    }
}
