import org.junit.*;

import static org.junit.Assert.assertEquals;

public class OddEvenPrimeTest {
    @Test
    public void should_print_number_of_given_range() {
        assertEquals("3\nEven\n5\nEven\n7\n", OddEvenPrime.print(3,8));
    }

    @Test
    public void should_convert_even_number_to_even() {
        assertEquals("Even", OddEvenPrime.convertOddEvenPrime(4));
        assertEquals("Even", OddEvenPrime.convertOddEvenPrime(20));
    }

    @Test
    public void should_convert_odd_number_to_odd() {
        assertEquals("Odd", OddEvenPrime.convertOddEvenPrime(9));
        assertEquals("Odd", OddEvenPrime.convertOddEvenPrime(55));
    }

    @Test
    public void should_convert_prime_number_to_prime() {
        assertEquals("2", OddEvenPrime.convertOddEvenPrime(2));
        assertEquals("3", OddEvenPrime.convertOddEvenPrime(3));
        assertEquals("41", OddEvenPrime.convertOddEvenPrime(41));
    }
}
