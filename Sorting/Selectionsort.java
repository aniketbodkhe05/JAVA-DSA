import java.util.Scanner;

public class Selectionsort {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to sort: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

      for(int i=0;i<n-2;i++){
        int minIndex = i;
        for(int j=i;j<n-1;j++){
          if(arr[j]<arr[minIndex]){
            minIndex=j;
          }
        }
       int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
      }

      System.out.println("Sorted array is: ");

      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
      }
  }

}
