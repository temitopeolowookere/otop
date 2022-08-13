package Practise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {
    @Test
    public void sumOfNumberTest(){
        Arithmetic arithmetic = new Arithmetic();
        assertNotNull(arithmetic);
    }

    @Test
    public void sum(){
        //given
        Arithmetic arithmetic = new Arithmetic();
        //when
        arithmetic.sum(5,7);
        //check
        assertEquals(12, arithmetic.getSum());
    }
}
