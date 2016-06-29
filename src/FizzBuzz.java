/**
 * Created by hpan on 6/28/16.
 */
public class FizzBuzz {
  public static void printFizzBuzz() {
    for (int i = 0; i < 100; i++) {
      System.out.println(convertFizzBuzz(i) + "\n");
    }
  }

  public static String convertFizzBuzz(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      return "fizzbuzz";
    }

    if (num % 3 == 0) {
      return "fizz";
    }

    if (num % 5 == 0) {
      return "buzz";
    }

    return String.valueOf(num);
  }
}
