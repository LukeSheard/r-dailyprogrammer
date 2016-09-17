import java.util.ArrayList;
import java.util.Collections;

public class Anagram {
  private String initialWord;
  private ArrayList<Character> initialWordArray;

  public static void main(String[] args) {
    try {
      compareWords(args[0], args[2]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Please supply the appropriate number of words to compare");
    }
  }

  public static void compareWords(String initialWord, String comparisonWord) {
    ArrayList<Character> initialWordArray = toCharArray(initialWord);
    ArrayList<Character> comparisonArray = toCharArray(comparisonWord);

    System.out.println(
      initialWord +
      " is " +
      (initialWordArray.equals(comparisonArray) ? "" : "NOT ") +
      "an anagram of " +
      comparisonWord
    );
  }

  public static ArrayList<Character> toCharArray(String string) {
    char[] conversionString = string.toLowerCase().toCharArray();
    ArrayList<Character> array = new ArrayList<Character>();

    for (int i = 0; i < conversionString.length; i += 1) {
      if (conversionString[i] != ' ') {
        array.add(conversionString[i]);
      }
    }

    Collections.sort(array);

    return array;
  }
}