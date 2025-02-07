import java.util.*;

public class J2016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            Arrays.sort(a);
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long k = (long) Math.sqrt(a[i] * a[i] + a[j] * a[j]);
                    if (k * k != a[i] * a[i] + a[j] * a[j]) {
                        break;
                    }
                    if (Arrays.binarySearch(a, k) > j) {
                        ok = 1;
                        break;
                    }
                }
            }
            System.out.println(ok == 1 ? "YES" : "NO");
        }
        sc.close();
    }
}