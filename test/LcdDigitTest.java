import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LcdDigitTest {
  @Test
  public void split_number_to_string_array() {
    assertThat(LcdDigit.splitNumber(9), is(new String[] {"9"}));
    assertThat(LcdDigit.splitNumber(23), is(new String[] {"2", "3"}));
  }

  @Test
  public void get_pattern_of_number() {
    assertThat(LcdDigit.getPattern("9"), is(new String[] {"._.", "|_|", "..|"}));
    assertThat(LcdDigit.getPattern("3"), is(new String[] {"._.", "._|", "._|"}));
  }

  @Test
  public void get_pattern_of_number_array() {
    assertThat(LcdDigit.getAllPattern(97), is("._. ._. \n|_| ..| \n..| ..| "));
  }

  @Test
  public void test_display() {
    LcdDigit.display(1234567890);
  }

}

