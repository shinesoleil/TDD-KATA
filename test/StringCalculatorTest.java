import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringCalculatorTest {
  @Test
  public void should_return_zero_when_empty() {
    assertThat(StringCalculator.add(""), is(0));
    assertThat(StringCalculator.add(null), is(0));
  }

  @Test
  public void should_return_int_value_when_one_number() {
    assertThat(StringCalculator.add("1"), is(1));
  }

  @Test
  public void should_return_sum_when_two_numbers() {
    assertThat(StringCalculator.add("1,2"), is(3));
  }

  @Test
  public void should_return_sum_when_multiple_numbers() {
    assertThat(StringCalculator.add("1,2,3"), is(6));
  }

  @Test
  public void should_accept_n_as_delimiter() {
    assertThat(StringCalculator.add("1,2\n3"), is(6));
  }

  @Test
  public void should_accept_user_defined_delimiter() {
    assertThat(StringCalculator.add("//&\n1&2&3"), is(6));
    assertThat(StringCalculator.add("//[&&@]\\n1&&@2&&@3"), is(6));
  }

  @Test
  public void should_ignore_number_greater_than_thousand() {
    assertThat(StringCalculator.add("4,1001,999"), is(1003));
  }

  @Rule
  public ExpectedException thrown = ExpectedException.none();

  @Test
  public void should_throw_exception_when_contain_negative() {
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage("contain negative");
    StringCalculator.add("23,-12,2");
  }


}
