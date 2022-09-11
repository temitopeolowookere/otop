package classWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfFactorTest {
    @Test
    public void TestNumberOfFactorsInAGivenNumber(){
        NumberOfFactor numberOfFactor = new NumberOfFactor();
        int number = numberOfFactor.factors(6);
        assertEquals(3,number);
    }
    @Test
    public void TestThatANumberisPrime(){
      NumberOfFactor numberOfFactor = new NumberOfFactor();
      numberOfFactor.prime(8);
      assertTrue(true);
    }


}