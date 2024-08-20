package tests;

import org.junit.Test;
import src.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSub01() {
        double a = 1.0;
        double b = 2.0;
        double excepted = -1.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testSub02() {
        double a = -1.0;
        double b = -2.0;
        double excepted = 1.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testSub03() {
        double a = -1.0;
        double b = 2.0;
        double excepted = -3.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testSub04() {
        double a = 0.0;
        double b = 0.0;
        double excepted = 0.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testSub05() {
        double a = 3.0;
        double b = -2.0;
        double excepted = 5.0;

        Calculator calculator = new Calculator();
        double actual = calculator.sub(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testAdd01() {
        double a = 3.0;
        double b = -2.0;
        double excepted = 1.0;

        Calculator calculator = new Calculator();
        double actual = calculator.add(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testAdd02() {
        double a = -3.0;
        double b = -2.0;
        double excepted = -5.0;

        Calculator calculator = new Calculator();
        double actual = calculator.add(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testAdd03() {
        double a = 3.0;
        double b = 2.0;
        double excepted = 5.0;

        Calculator calculator = new Calculator();
        double actual = calculator.add(a, b);
        assertEquals(excepted, actual, 0.01);
    }

    @Test
    public void testAdd04() {
        double a = 0.0;
        double b = 0.0;
        double excepted = 0.0;

        Calculator calculator = new Calculator();
        double actual = calculator.add(a, b);
        assertEquals(excepted, actual, 0.01);
    }

}
