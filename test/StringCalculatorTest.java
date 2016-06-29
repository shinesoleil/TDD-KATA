import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {
  @Test
  public void should_return_zero_when_empty() {
    assertEquals(0, StringCalculator.add(""));
    assertEquals(0, StringCalculator.add(null));
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

  @Test
  public void should_accept_user_defined_delimiter() {
    assertEquals(6, StringCalculator.add("//&\n1&2&3"));
    assertEquals(6, StringCalculator.add("//[&&@]\\n1&&@2&&@3"));
  }

  @Test
  public void should_ignore_number_greater_than_thousand() {
    assertEquals(1003, StringCalculator.add("4,1001,999"));
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
