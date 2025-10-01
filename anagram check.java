import java.util.*;
public class Main {
  public static boolean isAnagram(String a,String b) {
    a=a.replaceAll("[^A-Za-z]","").toLowerCase();
    b=b.replaceAll("[^A-Za-z]","").toLowerCase();
    if(a.length() != b.length()) return false;
    char[] A=a.toCharArray(), B=b.toCharArray();
    Arrays.sort(A); Arrays.sort(B);
    return Arrays.equals(A, B);
  }
  public static void main(String[] args) {
    System.out.println(isAnagram("Listen","Silent"));
    System.out.println(isAnagram("Hello","Olelh"));
  }
}
