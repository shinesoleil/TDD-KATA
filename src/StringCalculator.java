public class StringCalculator {

    public static int add(String s) {
        return (s == "" || s == null) ?  0 :  sum(s);
    }

    private static int sum(String s) {
        String delimitor = ",|\n";
        if (hasUserDefinedDelimitor(s)) {
            delimitor = getUserDefinedDelimitor(s);
            s = getNumberString(s);
        }
        String[] numbers = s.split(delimitor);

        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            int value = Integer.valueOf(numbers[i]);

            if (value < 0) {
               throw new IllegalArgumentException("contain negative");
            }

            res += isGreaterThanThousand(value)
                    ? 0
                    : value;
        }
        return res;
    }

    private static boolean hasUserDefinedDelimitor(String s) {
        return s.startsWith("//");
    }

    private static String getUserDefinedDelimitor(String s) {
        return s.substring(2, s.indexOf("\n"));
    }

    private static String getNumberString(String s) {
        return s.substring(s.indexOf("\n") + 1);
    }

    private static boolean isGreaterThanThousand(int num) {
        return num > 1000;
    }
}
