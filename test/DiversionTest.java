import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiversionTest {
  @Test
  public void testOneDigit() {
    assertEquals(0, Diversion.count(1));
  }

  @Test
  public void testTwoDigits() {
    assertEquals(3, Diversion.count(2));
  }

  @Test
  public void testThreeDigits() {
    assertEquals(5, Diversion.count(3));
  }

  @Test
  public void testFourDigits() {
    assertEquals(8, Diversion.count(4));
  }
}
