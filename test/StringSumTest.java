import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringSumTest {
    @Test
    public void shouldReturnSumOfTwoNaturalNumbers() {
        assertEquals("14", StringSum.sum("4", "10"));
    }
}
