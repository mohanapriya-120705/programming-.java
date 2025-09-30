import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter array size: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter array elements: ");
    for(int i=0;i<n;i++) arr[i] = sc.nextInt();
    int smallest = arr[0];
    for(int i=1;i<n;i++) {
      if(arr[i] < smallest) smallest = arr[i];
    }
    System.out.println("Smallest element: " + smallest);
    sc.close();
  }
}
