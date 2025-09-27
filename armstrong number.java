import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=sc.nextInt();
    int original=num,sum=0;
    while(num!=0) {
      int digit=num%10;
      sum+=Math.pow(digit,3);
      num/=10;
    }
    if(sum==original)
      System.out.println(original+" is an Armstrong Number");
    else
      System.out.println(original+"is not an Armstrong Number");
  }
}
