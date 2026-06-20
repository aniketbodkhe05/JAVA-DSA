public class pattern18 {
    public static void main(String ar[]) {
        int n = 2; // You need to define the value of n
        for (int i = 0; i < n; i++) {
            for (char ch1 = (char) ('E' - i); ch1 <= 'E'; ch1++) {
                System.out.print(ch1 + " ");
            }
            System.out.println();
        }
    }

}
