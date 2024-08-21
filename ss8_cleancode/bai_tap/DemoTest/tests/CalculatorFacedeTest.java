package tests;

import org.junit.Test;
import src.CalculatorFacede;
import static org.junit.Assert.assertEquals;

public class CalculatorFacedeTest {

    @Test
    public void testCalculatorAdd() throws Exception {
        String operator = "+";
        double num1 = 5;
        double num2 = 3;
        double excepted = 8;

        CalculatorFacede calculatorFacede = new CalculatorFacede();
        double actual = calculatorFacede.calculate(operator, num1, num2);
        assertEquals(excepted, actual, 0.01);
    }
}
