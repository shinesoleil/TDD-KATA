import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringSumTest {
    @Test
    public void shouldReturnSumOfTwoNaturalNumbers() {
        assertEquals("14", StringSum.sum("4", "10"));
    }

    @Test
    public void shouldConvertNonNaturalNumToZero() {
        assertEquals("9", StringSum.sum("1.2", "9"));
        assertEquals("7", StringSum.sum("7", "3.6"));
    }

    @Test
    public void shouldConvertEmptyOrNullToZero() {
        assertEquals("0", StringSum.sum("", null));
    }



}
