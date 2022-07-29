public class Main {
  public static void main(String[] names) {
    int[] numbers = { 3, 2, 5, 7, 9, 6, 1 };
    var sorter = new BubbleSort();
    sorter.sort(numbers);
    System.out.println(numbers);
  }
}