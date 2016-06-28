public class StringCalculator {

    public static int add(String s) {
        if (s == "") {
            return 0;
        }
        String[] numbers = s.split(",");
        
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            res += Integer.valueOf(numbers[i]);
        }
        return res;
    }
}
