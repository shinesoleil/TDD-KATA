import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class FizzBuzzTest {
  @Test
  public void should_print_one_to_thousand() {
    FizzBuzz.printFizzBuzz();
  }

  @Test
  public void should_normal_number_remain_unchanged() {
    assertThat(FizzBuzz.convertFizzBuzz(1), is("1"));
    assertThat(FizzBuzz.convertFizzBuzz(4), is("4"));
  }

  @Test
  public void should_convert_num_divisible_by_three_to_fizz() {
    assertThat(FizzBuzz.convertFizzBuzz(3), is("fizz"));
    assertThat(FizzBuzz.convertFizzBuzz(24), is("fizz"));
  }

  @Test
  public void should_convert_num_divisible_by_five_to_buzz() {
    assertThat(FizzBuzz.convertFizzBuzz(5), is("buzz"));
    assertThat(FizzBuzz.convertFizzBuzz(55), is("buzz"));
  }

  @Test
  public void should_convert_num_divisible_by_both_three_five_to_fizzbuzz() {
    assertThat(FizzBuzz.convertFizzBuzz(15), is("fizzbuzz"));
    assertThat(FizzBuzz.convertFizzBuzz(45), is("fizzbuzz"));
  }
}
