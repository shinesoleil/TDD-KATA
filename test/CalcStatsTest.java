import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by hpan on 6/29/16.
 */
public class CalcStatsTest {
  List<Integer> list;

  @Before
  public void initialize() {
    list = new LinkedList<Integer>();
    list.addAll(Arrays.asList(new Integer[]{3, -2, 6, 15, -11, 0, 41, 8}));
  }

  @Test
  public void should_return_min() {
    assertThat(CalcStats.processByStat(list, "min"), is("-11"));
  }

  @Test
  public void should_return_max() {
    assertThat(CalcStats.processByStat(list, "max"), is("41"));
  }

  @Test
  public void should_return_length() {
    assertThat(CalcStats.processByStat(list, "length"), is("8"));
  }

  @Test
  public void should_return_average() {
    assertThat(CalcStats.processByStat(list, "average"), is("7"));
  }
}
