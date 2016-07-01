import java.util.*;

public class HarryPotter {
  public static double totalPrice(ArrayList<Integer> bookNumbers) {
    final double price = 8.0;
    double totalPrice = 0.0;

    if (getTypes(bookNumbers) == 0) {
      return 0.0;
    }

    if (getTypes(bookNumbers) == 1) {
      return bookNumbers.get(0) * price;
    }

    while(getTypes(bookNumbers) >= 1) {
      int min = getMin(bookNumbers);
      int types = getTypes(bookNumbers);
      double discount = getDiscount(types);

      totalPrice += min * types * price * discount;
      bookNumbers = getNewBookNumbers(bookNumbers);
    }
    return totalPrice;
  }

  public static int getMin(ArrayList<Integer> bookNumbers) {
    return Collections.min(bookNumbers);
  }

  public static int getTypes(ArrayList<Integer> bookNumbers) {
    return bookNumbers.size();
  }

  public static double getDiscount(int types) {
    switch (types) {
      case 2: return 0.95;
      case 3: return 0.9;
      case 4: return 0.8;
      case 5: return 0.75;
      default: return 1.0;
    }
  }

  public static ArrayList<Integer> getNewBookNumbers
    (ArrayList<Integer> bookNumbers) {
    ArrayList<Integer> newBookNumbers = new ArrayList<Integer>();
    for (int i = 0; i < bookNumbers.size(); i++) {
      int newElement = bookNumbers.get(i) - getMin(bookNumbers);
      if (newElement != 0) {
        newBookNumbers.add(newElement);
      }
    }
    return newBookNumbers;
  }
}
