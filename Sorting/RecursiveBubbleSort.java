import java.util.Scanner;

public class RecursiveBubbleSort {

  public static void bubblesort(int i, int j, int[] arr, int n) {
    if (i == 0) {
      return;
    }
    if (j < i) {
      if (arr[j] > arr[j + 1]) {
        int temp;
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
      bubblesort(i, j + 1, arr, n);
    } else {
      bubblesort(i - 1, 0, arr, n);
    }

  }

  public static void main(String ar[]) {
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter number of elements: ");
     int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    bubblesort(n - 1, 0, arr, n);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
