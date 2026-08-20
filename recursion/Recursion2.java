class Recursion2 {
  public static void sumOfNumbers(int i, int n, int sum) {

    if (i > n) {
      System.out.println(sum);
      return;
    }

    sumOfNumbers(i + 1, n, sum + i);

  }

  public static void main(String ar[]) {
    sumOfNumbers(0, 6, 0);
  }
}
