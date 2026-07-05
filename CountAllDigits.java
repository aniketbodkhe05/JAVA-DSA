import java.util.Scanner;

public class CountAllDigits {
  public static void main(String ar[]){
    int num;
    System.out.println("Enter the number you want");
    Scanner sc = new Scanner(System.in);
    int count=0;
    num= sc.nextInt();

    while(num!=0){
     num=num/10;
      count++;

    }
    System.out.println("Total digits in a number: " +count);
  }
  
}
