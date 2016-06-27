/**
 * Created by hpan on 6/27/16.
 */
public class StringSum {
    public static String sum(String num1, String num2) {
        int value1 = Integer.parseInt(num1);
        int value2 = Integer.parseInt(num2);

        int res = value1 + value2;

        return Integer.toString(res);
    }
}
