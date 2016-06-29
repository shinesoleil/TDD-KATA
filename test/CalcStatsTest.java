import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by hpan on 6/29/16.
 */
public class CalcStatsTest {
    List<Integer> list;

    @Before
    public void initialize() {
        list = new LinkedList<Integer>();
        list.addAll(Arrays.asList(new Integer[] {3, -2, 6, 15, -11, 0, 41, 8}));
    }

    @Test
    public void should_return_min() {
        assertEquals("-11", CalcStats.processByStat(list, "min"));
    }

    @Test
    public void should_return_max() {
        assertEquals("41", CalcStats.processByStat(list, "max"));
    }

    @Test
    public void should_return_length() {
        assertEquals("8", CalcStats.processByStat(list, "length"));
    }

    @Test
    public void should_return_average() {
        assertEquals("7", CalcStats.processByStat(list, "average"));
    }
}
