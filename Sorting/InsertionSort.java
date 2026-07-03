import java.util.Scanner;

public class InsertionSort{
  public static void main(String agr[]){
 Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements you want to sort: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for(int i=0;i<=n-1;i++){
      int j=i;
      int temp;
      while(j>0 && arr[j-1]>arr[j]){
        temp = arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
      }
    }

   System.out.println("Sorted array");

   for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }

  }
}
