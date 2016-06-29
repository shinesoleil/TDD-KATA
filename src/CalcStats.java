import java.util.Collections;
import java.util.List;

public class CalcStats {
  public static String processByStat(List<Integer> list, String stat) {
    switch (stat) {
      case ("min"): {
        return Collections.min(list).toString();
      }
      case ("max"): {
        return Collections.max(list).toString();
      }
      case ("length"): {
        return String.valueOf(list.size());
      }
      case ("average"): {
        return getAverage(list);
      }
    }
    return null;
  }

  private static String getAverage(List<Integer> list) {
    int sum = 0;

    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }

    return String.valueOf(sum / list.size());
  }
}
