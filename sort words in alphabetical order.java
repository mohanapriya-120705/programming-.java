import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a sentence: ");
    String sentence = sc.nextLine();
    String[] words = sentence.split("\\s+");
    Arrays.sort(words);
    System.out.println("Sorted words:");
    for(String word : words)
      System.out.println(word);
    sc.close();
  }
}
