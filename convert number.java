public class Main {
  static String[] ones = {"zero","ones","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
  static String[] tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
  public static String convert(int n) {
    if(n<0||n>999) throw new IllegalArgumentException("0..999 only");
    if(n<20) return ones[n];
    if(n<100) {
      int t=n/10,o=n%10;
      return tens[t] + (o==0?"":""+ones[o]);
    }
    int h = n/100;
    int rem = n%100;
    return ones[h]+"hundred"+(rem==0?"":"and"+convert(rem));
  }
  public static void main(String[] args) {
    System.out.println(convert(234));
    System.out.println(convert(200));
      System.out.println(convert(0));
  }
}
