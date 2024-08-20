package tests;
import classes.FizzBuzzTranslate;
import org.junit.Test;

public class FizzBuzzTranslateTest {

    @Test
    public void fizzBuzzTest01() {
       double input = 6;

       String expected = "Fizz";

       FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
       String actual = fizzBuzzTranslate.fizzBuzzTranslate(input);
       assert expected.equals(actual);

    }

    @Test
    public void fizzBuzzTest02() {
        double input = 5;

        String expected = "Buzz";

        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        String actual = fizzBuzzTranslate.fizzBuzzTranslate(input);
        assert expected.equals(actual);

    }

    @Test
    public void fizzBuzzTest03() {
        double input = 11;

        String expected = "muoi mot";

        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        String actual = fizzBuzzTranslate.fizzBuzzTranslate(input);
        assert expected.equals(actual);
    }

    @Test
    public void fizzBuzzTest04() {
        double input = 13;

        String expected = "Buzz";

        FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();
        String actual = fizzBuzzTranslate.fizzBuzzTranslate(input);
        assert expected.equals(actual);
    }
}
