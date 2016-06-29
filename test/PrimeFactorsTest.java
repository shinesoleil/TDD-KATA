import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

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
    assertThat(PrimeFactors.generate(1), is(list()));
  }

  @Test
  public void testTwo() {
    assertThat(PrimeFactors.generate(2), is(list(2)));
  }

  @Test
  public void testThree() {
    assertThat(PrimeFactors.generate(3), is(list(3)));
  }

  @Test
  public void testFour() {
    assertThat(PrimeFactors.generate(4), is(list(2, 2)));
  }

  @Test
  public void testFive() {
    assertThat(PrimeFactors.generate(5), is(list(5)));
  }

  @Test
  public void testSix() {
    assertThat(PrimeFactors.generate(6), is(list(2, 3)));
  }

  @Test
  public void testEight() {
    assertThat(PrimeFactors.generate(8), is(list(2, 2, 2)));
  }

  @Test
  public void testNine() {
    assertThat(PrimeFactors.generate(9), is(list(3, 3)));
  }

  @Test
  public void test121() {
    assertThat(PrimeFactors.generate(121), is(list(11, 11)));
  }
}