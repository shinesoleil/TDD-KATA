import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
    @Test
    public void should_return_zero_when_empty() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void should_return_int_value_when_one_number() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void should_return_sum_when_two_numbers() {
        assertEquals(3, StringCalculator.add("1,2"));
    }

    @Test
    public void should_return_sum_when_multiple_numbers() {
        assertEquals(6, StringCalculator.add("1,2,3"));
    }

    @Test
    public void should_accept_n_as_delimiter() {
        assertEquals(6, StringCalculator.add("1,2\n3"));
    }
}
