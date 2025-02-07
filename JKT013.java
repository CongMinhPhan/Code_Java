import java.util.Scanner;
import java.util.Vector;

public class JKT013 {

    static int n;
    static Vector<String> v = new Vector<>();

    static void Try(String s, int k) {
        if (s.length() == k) {
            v.add(s);
            return;
        }
        Try(s + "6", k);
        Try(s + "8", k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            v.clear();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                Try("", i);
            System.out.println(v.size());
            for (int i = v.size() - 1; i >= 0; i--)
                System.out.print(v.get(i) + " ");
            System.out.println();
        }
        sc.close();
    }
}