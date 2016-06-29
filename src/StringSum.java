import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.floor;


public class StringSum {
  public static String sum(String num1, String num2) {
    int value1 = isNaturalNum(num1) ? Integer.parseInt(num1) : 0;
    int value2 = isNaturalNum(num2) ? Integer.parseInt(num2) : 0;

    int res = value1 + value2;

    return Integer.toString(res);
  }

  public static boolean isNaturalNum(String num) {
    Pattern pattern = Pattern.compile("^[0-9]*$");
    Matcher matcher = pattern.matcher(num);

    if (num == "" || num == null) {
      return false;
    }

    if (!matcher.matches()) {
      System.out.println(matcher.matches());
      return false;
    }
    return true;
  }
}
