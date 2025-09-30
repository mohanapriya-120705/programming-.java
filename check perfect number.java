import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1; i<n; i++) {
      if(n%i==0) sum +=i;
    }
    if(sum == n)
      System.out.println(n + " is a Prefect Number");
    else
      System.out.println(n + " is Not Perfect");
    sc.close();
  }
}
