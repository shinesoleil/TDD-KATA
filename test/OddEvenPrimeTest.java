import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class OddEvenPrimeTest {
  @Test
  public void should_print_number_of_given_range() {
    assertThat(OddEvenPrime.print(3, 8), is("3\nEven\n5\nEven\n7\n"));
  }

  @Test
  public void should_convert_even_number_to_even() {
    assertThat(OddEvenPrime.convertOddEvenPrime(4), is("Even"));
    assertThat(OddEvenPrime.convertOddEvenPrime(20), is("Even"));
  }

  @Test
  public void should_convert_odd_number_to_odd() {
    assertThat(OddEvenPrime.convertOddEvenPrime(9), is("Odd"));
    assertThat(OddEvenPrime.convertOddEvenPrime(55), is("Odd"));
  }

  @Test
  public void should_convert_prime_number_to_prime() {
    assertThat(OddEvenPrime.convertOddEvenPrime(2), is("2"));
    assertThat(OddEvenPrime.convertOddEvenPrime(3), is("3"));
    assertThat(OddEvenPrime.convertOddEvenPrime(41), is("41"));
  }
}
