public class fibonaciiSeries {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 10;
        System.out.println(a + " " + b);
        for (int i = 0; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        // System.out.println();
    }
}
