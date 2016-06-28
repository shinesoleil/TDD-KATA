public class StringCalculator {

    public static int add(String s) {
        return (s == "" || s == null) ?  0 :  sum(s);
        

    }

    private static int sum(String s) {
        String[] numbers = s.split(",|\n");
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += Integer.valueOf(numbers[i]);
        }
        return res;
    }
}
