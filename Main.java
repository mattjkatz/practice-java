import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // System.out.println("Hello World - this is a test");
    int[] arr = new int[5];
    arr[0] = 4;
    arr[1] = 2;
    arr[2] = 6;
    arr[3] = 9;
    arr[4] = 3;
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
  }
}