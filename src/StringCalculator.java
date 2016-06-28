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
            res += Integer.valueOf(numbers[i]);
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
}
