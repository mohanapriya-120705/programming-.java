import java.util.*;
public class Main {
  public static String removeDuplicates(String s) {
    String[] words = s.split("\\s+");
    LinkedHashSet<String> seen = new LinkedHashSet<>();
    for(String w : words) if (!w.isEmpty()) seen.add(w);
    return String.join(" ", seen);
  }
  public static void main(String[] args) {
    String input = "Hello hello Ab aB Hello Ab";
    System.out.println(removeDuplicates(input));
  }
}
