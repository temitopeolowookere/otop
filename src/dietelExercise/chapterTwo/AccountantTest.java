package dietelExercise.chapterTwo;

import java.util.Scanner;
// drivers class calling another class account.
public class AccountantTest {

    public static void main(String[] args) {

        Accountant accountant = new Accountant("jane doe",20.0);
        Scanner addDeposit = new Scanner(System.in);

        System.out.println( " enter your deposit amount:");
        double amountDeposited = addDeposit.nextDouble();
        accountant.deposit(amountDeposited);

        System.out.println( accountant.getName());
        System.out.println(accountant.getBalance());

        Scanner addWithdraw = new Scanner(System.in);
        System.out.println( " enter amount to withdraw");

        double  amountToWithdraw = addWithdraw.nextDouble();
        accountant.withdraw(amountToWithdraw);
        System.out.println(accountant.getWithdrawal());







    }

}
