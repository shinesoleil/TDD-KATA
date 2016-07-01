import java.util.HashMap;
import java.util.Map;

public class LcdDigit {

  public static String[] splitNumber(int i) {
    return String.valueOf(i).split("");
  }

  public static String[] getPattern(String numberStr) {

    Map<String, String[]> dictionnary = new HashMap<>();

    dictionnary.put("0", new String[]{"._.", "|.|", "|_|"});
    dictionnary.put("1", new String[]{"...", "..|", "..|"});
    dictionnary.put("2", new String[]{"._.", "._|", "|_."});
    dictionnary.put("3", new String[]{"._.", "._|", "._|"});
    dictionnary.put("4", new String[]{"...", "|_|", "..|"});
    dictionnary.put("5", new String[]{"._.", "|_.", "._|"});
    dictionnary.put("6", new String[]{"._.", "|_.", "|_|"});
    dictionnary.put("7", new String[]{"._.", "..|", "..|"});
    dictionnary.put("8", new String[]{"._.", "|_|", "|_|"});
    dictionnary.put("9", new String[]{"._.", "|_|", "..|"});

    return dictionnary.get(numberStr);
  }

  public static String getAllPattern(int number) {
    String[] digitsStr = splitNumber(number);
    String firstLine = "";
    String secondLine = "";
    String thirdLine = "";
    for (int i = 0; i < digitsStr.length; i++) {
      System.out.println(getPattern(digitsStr[i])[0]);

      System.out.println(getPattern(digitsStr[i])[1]);

      System.out.println(getPattern(digitsStr[i])[2]);

      firstLine += getPattern(digitsStr[i])[0] + " ";
      secondLine += getPattern(digitsStr[i])[1] + " ";
      thirdLine += getPattern(digitsStr[i])[2] + " ";
    }

    return firstLine + "\n" + secondLine + "\n" + thirdLine;
  }

  public static void display(int number) {
    System.out.println(getAllPattern(number));
  }
}
