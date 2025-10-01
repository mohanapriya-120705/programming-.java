public class Main {
  public static int binarySearch(int[] arr,int target) {
    int l = 0,r = arr.length -1;
    while(l <= r) {
      int mid = 1 + (r - l) / 2;
      if(arr[mid] == target) return mid;
      else if(arr[mid] < target) l = mid + 1;
      else r = mid - 1;
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] a = {1,3,5,7,9,11};
    System.out.println(binarySearch(a, 7));
    System.out.println(binarySearch(a, 2));
  }
}
