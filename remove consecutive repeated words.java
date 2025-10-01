import java.util.regex.*;
public class Main {
  public static String fix(String s) {
    Pattern p = Pattern.compile("(?i)\\b(\\w+)(?:\\s+\\1\\b)+");
    Matcher m = p.matcher(s);
    return m.replaceAll("$1");
  }
  public static void main(String[] args) {
    String s = "I love Love to To tO code";
    System.out.println(fix(s));
  }
}
