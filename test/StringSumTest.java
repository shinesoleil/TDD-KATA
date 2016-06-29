import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class StringSumTest {
  @Test
  public void shouldReturnSumOfTwoNaturalNumbers() {
    assertThat(StringSum.sum("4", "10"), is("14"));
  }

  @Test
  public void shouldConvertNonNaturalNumToZero() {
    assertThat(StringSum.sum("1.2", "9"), is("9"));
    assertThat(StringSum.sum("7", "3.6"), is("7"));
  }

  @Test
  public void shouldConvertEmptyOrNullToZero() {
    assertThat(StringSum.sum("", null), is("0"));
  }


}
