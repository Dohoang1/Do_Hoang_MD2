package tests;

import classes.NextDayCalculator;
import org.junit.Test;

public class NextDayCalculatorTest {
    @Test
    public void testNextDay01() {
        int day  = 1;
        int month = 1;
        int year = 2018;

        String excepted = "2-1-2018";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

    @Test
    public void testNextDay02() {
        int day  = 31;
        int month = 1;
        int year = 2018;

        String excepted = "1-2-2018";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

    @Test
    public void testNextDay03() {
        int day  = 30;
        int month = 4;
        int year = 2018;

        String excepted = "1-5-2018";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

    @Test
    public void testNextDay04() {
        int day  = 28;
        int month = 2;
        int year = 2018;

        String excepted = "1-3-2018";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

    @Test
    public void testNextDay05() {
        int day  = 29;
        int month = 2;
        int year = 2020;

        String excepted = "1-3-2020";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

    @Test
    public void testNextDay06() {
        int day  = 31;
        int month = 12;
        int year = 2018;

        String excepted = "1-1-2019";

        NextDayCalculator calculator = new NextDayCalculator();
        String actual = calculator.getNextDay(day, month, year);
        assert actual.equals(excepted);
    }

}
