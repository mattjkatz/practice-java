// public class HelloWorld {
  
//   public static void main(String[] args) {
//     System.out.println("Hello world");
//   }

// }

public class BubbleSort {

  public static void bubbleSort(String[] args) {
    int n = arr.length;
    for(int i=0; i < n - 1; i++) {
      for(int j=0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    String[] nums = {2, 4, 1, 5, 7, 8, 3};
    bubbleSort(nums);
    System.out.println(nums);
  }
}