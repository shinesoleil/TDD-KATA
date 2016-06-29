public class Diversion {
  public static int count(int digitNumber) {
    if (digitNumber == 1) {
      return 0;
    }

    int countEndWithZero = 1;
    int countEndWithOne = 1;

    for (int i = 0; i < digitNumber - 1; i++) {
      int previousCountEndWithZero = countEndWithZero;
      countEndWithZero = countEndWithZero + countEndWithOne;
      countEndWithOne = previousCountEndWithZero;
    }

    return countEndWithOne + countEndWithZero;
  }
}
