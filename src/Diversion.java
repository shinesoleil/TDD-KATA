public class Diversion {
  public static int count(int digitNumber) {
    int zeroAtEnd = 1;
    int oneAtEnd = 1;

    if (digitNumber == 1) {
      return 0;
    }

    for (int i = 1; i < digitNumber; i++) {
      int temp = zeroAtEnd;
      zeroAtEnd += oneAtEnd;
      oneAtEnd = temp;
    }

    return oneAtEnd + zeroAtEnd;
  }
}
