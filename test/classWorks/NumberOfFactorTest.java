package classWorks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfFactorTest {
    @Test
    public void TestNumberOfFactorsInAGivenNumber(){
        NumberOfFactor numberOfFactor = new NumberOfFactor();
        int number = numberOfFactor.factors(6);
        assertEquals(4,number);
    }


}