public class pattern15 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (char ch1 = 'A'; ch1 <= 'A' + (n - i); ch1++) {
        System.out.print(ch1);
      }
      System.out.println();
    }
  }

}
