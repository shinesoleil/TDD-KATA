import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int i) {
        List<Integer> primes =  new ArrayList<Integer>();
        int div = 2;

        while (i > 1) {
            while(i%div == 0) {
                primes.add(div);
                i /= div;
            }
            div++;
        }
        if (i > 1) {
            primes.add(i);
        }
        return primes;
    }
}
