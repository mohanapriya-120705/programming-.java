import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    while(num!=0) {
      count++;
      num/=10;
    }
    System.out.println("Digit="+count);
    sc.close();
  }
}
