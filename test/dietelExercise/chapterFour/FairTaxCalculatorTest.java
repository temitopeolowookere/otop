package dietelExercise.chapterFour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FairTaxCalculatorTest {
    private FairTaxCalculator fairTaxCalculator;
    @BeforeEach
    void startWithThis(){
        fairTaxCalculator = new FairTaxCalculator();

    }
    @Test
    public void TestThatFairTaxCanBeCalculated(){
        // given
        Product product = new Product(" milo", 100.00);
        // when
        double tax = fairTaxCalculator.calculateTax(product.getPrice());
        //assert
        assertEquals(23,tax);

    }

    @Test
    public void TestThatProductTotalPriceCanBeCalculated(){
        // given
        fairTaxCalculator.setTotalPrice(50);

        //when

       double totalPrice =  fairTaxCalculator.calculateTotalPrice(100.00);
       //assert
        assertEquals(150.00, totalPrice);
    }

}