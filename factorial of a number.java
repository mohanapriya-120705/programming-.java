import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Even a number: ");
    int num=sc.nextInt();
    int fact=1;
    for(int i=1;i<=num;i++) {
      fact*=i;
    }
    System.out.println("Factorial: " + fact);
    sc.close();
  }
}
