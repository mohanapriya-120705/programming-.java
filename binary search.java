import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = {10,20,30,40,50,60,70};
    System.out.print("Enter number to search: ");
    int key = sc.nextInt();
    int low = 0,high = arr.length - 1,mid;
    boolean found = false;
    while(low <= high) {
      mid = (low + high) / 2;
      if(arr[mid] == key) {
        System.out.println("Element found at index " + mid);
        found = true;
        break;
      } else if(arr[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    if(!found)
      System.out.println("Element not found.");
    sc.close();
  }
}
