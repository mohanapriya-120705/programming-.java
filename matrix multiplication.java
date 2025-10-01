public class Main {
  public static int[][] multiply(int[][] A, int[][] B) {
    int r1=A.length,c1=A[0].length,r2=B.length,c2=B[0].length;
    if(c1 != r2) throw new IllegalArgumentException("Incompatible dims");
    int[][] C=new int[r1][c2];
    for(int i=0;i<r1;i++)
      for(int j=0;j<c2;j++)
        for(int k=0;k<c1;k++)
          C[i][j] += A[i][k] * B[k][j];
    return C;
  }
  static void print(int[][] M) {
    for(int[] row : M) {
      for(int v : row) System.out.print(v + " ");
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int[][] A = {{1,2,3},{4,5,6}};
    int[][] B = {{7,8},{9,10},{11,12}};
    int[][] C = multiply(A,B);
    print(C);
  }
}
