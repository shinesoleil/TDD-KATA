import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DiversionTest {
  @Test
  public void testOneDigit() {
    assertThat(Diversion.count(1), is(0));
  }

  @Test
  public void testTwoDigits() {
    assertThat(Diversion.count(2), is(3));
  }

  @Test
  public void testThreeDigits() {
    assertThat(Diversion.count(3), is(5));
  }

  @Test
  public void testFourDigits() {
    assertThat(Diversion.count(4), is(8));
  }
}
