import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = sc.nextInt();
    System.out.print("Enter number of columns: ");
    int cols = sc.nextInt();
    int[][] a = new int[rows][cols];
    int[][] b = new int[rows][cols];
    int[][] sum = new int[rows][cols];
    System.out.println("Enter elements of first matrix:");
    for(int i=0;i<rows;i++)
      for(int j=0;j<cols;j++)
        a[i][j]=sc.nextInt();
    System.out.println("Enter elements of second matrix:");
    for(int i=0;i<rows;i++) {
      for(int j=0;i<cols;j++)
      System.out.print(sum[i][j]+" ");
      System.out.println();
    }
    sc.close();
  }
}
