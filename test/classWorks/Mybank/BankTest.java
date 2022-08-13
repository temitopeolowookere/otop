package classWorks.Mybank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank accessbank;
    @BeforeEach
    public void startWithThis(){
       accessbank = new Bank();

    }
    @Test
    public void bankExistsTest(){
        assertNotNull(accessbank);
    }
    @Test
     public void accountCanBeCreatedTest(){
        // given that there is a  bank
        // when i create account
        // check that number of account created is 1
        accessbank. createAccountFor(" temitope olowo","2727");
        assertEquals(1, accessbank.getNumberOfCustomers());

        Account account = accessbank.findAccount("1");
        assertEquals("temitope olowo",account.getName());

    }

    @Test
    public void customerCanDepositInHerAccountTest(){
      accessbank.createAccountFor("temitope olowo", "2727");
      accessbank.deposit(2000, "1");

      Account bankeAccount = accessbank.findAccount("1");
      assertEquals(2000, bankeAccount.getBalance("2727"));

    }




}
