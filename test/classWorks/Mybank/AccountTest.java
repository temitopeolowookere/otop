package classWorks.Mybank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void accountCanBeCreatedTest(){
        //given that account exists
        // check thaty account exisits
        //check that balance is zero
        Account account =  new Account("21601828", "Banke Celina", "1234");
        assertNotNull(account);
        assertEquals(0,account.getBalance("1257"));
    }

    @ Test
    public void depositMoney_balanceIncreasesTest(){
        //given that i have an account and account balance is zero;
        // when i depisit 200
        // check that nbalance is 200
        Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
        assertEquals(0,bankeAccount.getBalance("1234"));
        bankeAccount.deposit(200);
        assertEquals(200,bankeAccount.getBalance("1234"));
    }

    @Test
    public void cannotDepositNegativeAmountTest(){
        // givemn i have an account and balance is zero
        // when i try to deposit -2500
        // check that balance is zero
        Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
        assertEquals(0, bankeAccount.getBalance("1212"));
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance("1212"));
    }

    @Test
    @DisplayName( "Getting balance with invalid pin returns zero")
    public void getBalanceWithWrongPin_returnsZeroTest(){
        // givem that i have momneyb in my account
        // when i check my account with wrong pin
        //balance is zero
        Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
        int myBalance =  bankeAccount.getBalance( "1212");
        assertEquals(0,myBalance);
    }
    @Test
    @DisplayName( "Getting balance with valid pin returns real balance")
    public void getBalanceWithWrongPin_returnsRealBalanceTest() {
        Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
        int myBalance = bankeAccount.getBalance("1234");
        assertEquals(0, myBalance);

    }
    @Test
    @DisplayName( " getting balance after you withdraw with correct pin")
    public void withdrawMoneywithrightpin(){
        //given that i  have an account and balance is 20000
        // when i try to withdraw 5000
        // check that current balance is 15000

        Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
        int myBalance =  bankeAccount.getBalance("1234");
        bankeAccount.deposit(20000);
        bankeAccount.withdraw(-3000,"1234");
        assertEquals(20000,bankeAccount.getBalance("1234"));
    }

        @Test
    public void withdrawWithWringPinDoesNotWorkTest(){
            Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
            int myBalance =  bankeAccount.getBalance("1234");
            bankeAccount.deposit(20000);
            bankeAccount.withdraw(10000,"1669");
            assertEquals(20000,bankeAccount.getBalance("1234"));
        }

        @Test
        @DisplayName(" if pin is correct and amount exceeds balance, withdraw does not work")
    public void withdrawWithRightPinButHIghAmountDoesNotWorkTest(){

            Account bankeAccount = new Account("21601828", "Banke Celina", "1234");
            int myBalance =  bankeAccount.getBalance("1234");
            bankeAccount.deposit(20000);
            bankeAccount.withdraw(30000,"1234");
            assertEquals(20000,bankeAccount.getBalance("1234"));
        }

}