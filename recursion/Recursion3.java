public class Recursion3 {
  public static void printFactorial(int i,int n,int factorial){
    if(i>n){
      System.out.print(factorial);
      return;
    }

    printFactorial(i+1,n,factorial*i);
  }
  public static void main(String ar[]){
    printFactorial(1,6,1);
  }
}
