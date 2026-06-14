class pattern16 {
  public static void main(String[] args) {
    int n = 5;
    for (char ch = 'A'; ch <'A'+n; ch++) {
      for (char ch1 = 'A'; ch1 <= ch; ch1++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}
