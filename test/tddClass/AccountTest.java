package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AccountTest {
    @Test
    @DisplayName("Deposit money, balance increase test")
    public void depositMoneyBalanceIncreaseTest(){
        //given
        Account jennyAccount = new Account();
        // when
        jennyAccount.deposit(500);
        //check
        assertEquals(500, jennyAccount.getbalance());





    }
    @Test
    @DisplayName("Deposit money, balance increase test")
    public void negativeDepositTest(){
        //given
        Account jennyAccount = new Account();
        // when
        jennyAccount.deposit(-500);
        //check
        assertNotEquals(500, jennyAccount.getbalance());





    }


    @Test
    @DisplayName("Deposit money, balance increase test")
    public void withdrawWorkTest(){
        //given
        Account jennyAccount = new Account();
        jennyAccount.deposit(2000);
        // when
        jennyAccount.withdraw(2500);

        //check
        assertEquals(1500, jennyAccount.getbalance());
       // assertNotEquals(700, jennyAccount.getbalance());





    }


}
