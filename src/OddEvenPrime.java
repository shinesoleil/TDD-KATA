public class OddEvenPrime {
    public static String print(int start, int end) {
        String res = "";

        for (int i = start; i < end; i++) {
            res += convertOddEvenPrime(i) + "\n";
            System.out.println(i + "\n");
        }

        return res;
    }

    public static String convertOddEvenPrime(int num) {
        String res;

        res = isEven(num) ? "Even" : String.valueOf(num);
        res = isOdd(num) ? "Odd" : res;
        res = isPrime(num) ? String.valueOf(num) : res;

        return res;

    }

    public static boolean isEven(int num) {
        return (num >= 2 && num%2 == 0);
    }

    public static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }

        int diversion = 2;
        while(diversion < num) {
            if (num % diversion == 0) {
                return false;
            }
            diversion += 1;
        }
        return true;
    }
}