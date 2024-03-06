import java.util.Scanner;

public class Line_trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int testCase = 0; testCase < t; testCase++) {
                int n = sc.nextInt();
                int x = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int last = 0;
                int ans = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    ans = Math.max(ans, a[i] - last);
                    last = a[i];
                }
                ans = Math.max(ans, 2 * (x - last));
                System.out.println(ans);

            }

        }
    }
}
