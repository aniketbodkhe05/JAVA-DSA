import java.util.Scanner;

public class BubbleSort {
  public static void main(String args[]){
    
    System.out.println("Enter array of elements you want:");

    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr= new int[n];
    System.out.println("Enter array Elements:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }

    int temp;
    //bubble sort 
    for(int i=n-1;i>=1;i--){
      for(int j=0;j<i;j++){
        if(arr[j]>arr[j+1]){
          temp =arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }

    System.out.println("SOrted array:");
    for(int i=0;i<n;i++){
      System.out.print(arr[i] +" ");
    }
  }
  
}
