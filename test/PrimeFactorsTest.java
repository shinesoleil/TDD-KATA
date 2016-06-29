import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
  private List<Integer> list(int... ints) {
    List<Integer> list = new ArrayList<Integer>();
    for (int i : ints) {
      list.add(i);
    }
    return list;
  }

  @Test
  public void testOne() {
    assertEquals(list(), PrimeFactors.generate(1));
  }

  @Test
  public void testTwo() {
    assertEquals(list(2), PrimeFactors.generate(2));
  }

  @Test
  public void testThree() {
    assertEquals(list(3), PrimeFactors.generate(3));
  }

  @Test
  public void testFour() {
    assertEquals(list(2, 2), PrimeFactors.generate(4));
  }

  @Test
  public void testFive() {
    assertEquals(list(5), PrimeFactors.generate(5));
  }

  @Test
  public void testSix() {
    assertEquals(list(2, 3), PrimeFactors.generate(6));
  }

  @Test
  public void testEight() {
    assertEquals(list(2, 2, 2), PrimeFactors.generate(8));
  }

  @Test
  public void testNine() {
    assertEquals(list(3, 3), PrimeFactors.generate(9));
  }

  @Test
  public void test121() {
    assertEquals(list(11, 11), PrimeFactors.generate(121));
  }
}