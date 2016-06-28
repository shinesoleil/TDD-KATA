import org.junit.*;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_print_one_to_thousand() {
        FizzBuzz.printFizzBuzz();
    }

    @Test
    public void should_normal_number_remain_unchanged() {
        assertEquals("1", FizzBuzz.convertFizzBuzz(1));
        assertEquals("4", FizzBuzz.convertFizzBuzz(4));
    }

    @Test
    public void should_convert_num_divisible_by_three_to_fizz() {
        assertEquals("fizz", FizzBuzz.convertFizzBuzz(3));
        assertEquals("fizz", FizzBuzz.convertFizzBuzz(24));
    }

    @Test
    public void should_convert_num_divisible_by_five_to_buzz() {
        assertEquals("buzz", FizzBuzz.convertFizzBuzz(5));
        assertEquals("buzz", FizzBuzz.convertFizzBuzz(55));
    }

    @Test
    public void should_convert_num_divisible_by_both_three_five_to_fizzbuzz() {
        assertEquals("fizzbuzz", FizzBuzz.convertFizzBuzz(15));
        assertEquals("fizzbuzz", FizzBuzz.convertFizzBuzz(45));
    }
}
