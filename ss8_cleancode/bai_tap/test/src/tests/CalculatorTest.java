package tests;

import classes.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testSubTwoPositiveIntegers() {
        double a = 2.0;
        double b = 10.0;

        double excepted = -8.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual);

    }
}
